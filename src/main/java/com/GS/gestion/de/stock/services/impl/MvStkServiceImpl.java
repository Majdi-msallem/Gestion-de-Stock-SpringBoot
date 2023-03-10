package com.GS.gestion.de.stock.services.impl;

import com.GS.gestion.de.stock.dto.MvStkDto;
import com.GS.gestion.de.stock.exception.ErrorCodes;
import com.GS.gestion.de.stock.exception.InvalidEntityException;
import com.GS.gestion.de.stock.model.TypeMvStk;
import com.GS.gestion.de.stock.repository.MvStkRepository;
import com.GS.gestion.de.stock.services.ArticleService;
import com.GS.gestion.de.stock.services.MvStkService;
import com.GS.gestion.de.stock.validator.MvStkValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MvStkServiceImpl implements MvStkService {

    private MvStkRepository repository;
    private ArticleService articleService;

    @Autowired
    public MvStkServiceImpl(MvStkRepository repository, ArticleService articleService) {
        this.repository = repository;
        this.articleService = articleService;
    }

    @Override
    public BigDecimal stockReelArticle(Integer idArticle) {
        if (idArticle == null) {
            log.warn("ID article is NULL");
            return BigDecimal.valueOf(-1);
        }
        articleService.findById(idArticle);
        return repository.stockReelArticle(idArticle);    }

    @Override
    public List<MvStkDto> mvtStkArticle(Integer idArticle) {
        return repository.findAllByArticleId(idArticle).stream()
                .map(MvStkDto::fromEntity)
                .collect(Collectors.toList());    }

    @Override
    public MvStkDto entreeStock(MvStkDto dto) {
        return entreePositive(dto, TypeMvStk.ENTREE);
    }

    @Override
    public MvStkDto sortieStock(MvStkDto dto) {
        return sortieNegative(dto, TypeMvStk.SORTIE);
    }

    @Override
    public MvStkDto correctionStockPos(MvStkDto dto) {
        return entreePositive(dto, TypeMvStk.CORRECTION_POS);
    }

    @Override
    public MvStkDto correctionStockNeg(MvStkDto dto) {
        return sortieNegative(dto, TypeMvStk.CORRECTION_NEG);
    }

    private MvStkDto entreePositive(MvStkDto dto, TypeMvStk typeMvtStk) {
        List<String> errors = MvStkValidator.validate(dto);
        if (!errors.isEmpty()) {
            log.error("Article is not valid {}", dto);
            throw new InvalidEntityException("Le mouvement du stock n'est pas valide", ErrorCodes.MVT_STK_NOT_VALID, errors);
        }
        dto.setQuantite(
                BigDecimal.valueOf(
                        Math.abs(dto.getQuantite().doubleValue())
                )
        );
        dto.setTypeMvt(typeMvtStk);
        return MvStkDto.fromEntity(
                repository.save(MvStkDto.toEntity(dto))
        );
    }

    private MvStkDto sortieNegative(MvStkDto dto, TypeMvStk typeMvtStk) {
        List<String> errors = MvStkValidator.validate(dto);
        if (!errors.isEmpty()) {
            log.error("Article is not valid {}", dto);
            throw new InvalidEntityException("Le mouvement du stock n'est pas valide", ErrorCodes.MVT_STK_NOT_VALID, errors);
        }
        dto.setQuantite(
                BigDecimal.valueOf(
                        Math.abs(dto.getQuantite().doubleValue()) * -1
                )
        );
        dto.setTypeMvt(typeMvtStk);
        return MvStkDto.fromEntity(
                repository.save(MvStkDto.toEntity(dto))
        );
    }
}
