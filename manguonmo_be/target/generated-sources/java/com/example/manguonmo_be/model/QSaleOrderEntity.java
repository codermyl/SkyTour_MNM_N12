package com.example.manguonmo_be.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSaleOrderEntity is a Querydsl query type for SaleOrderEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSaleOrderEntity extends EntityPathBase<SaleOrderEntity> {

    private static final long serialVersionUID = 1762583361L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSaleOrderEntity saleOrderEntity = new QSaleOrderEntity("saleOrderEntity");

    public final QAttributesCommon _super = new QAttributesCommon(this);

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Integer> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath customerEmail = createString("customerEmail");

    public final StringPath customerName = createString("customerName");

    public final StringPath customerPhone = createString("customerPhone");

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final StringPath note = createString("note");

    public final NumberPath<Integer> numberAdult = createNumber("numberAdult", Integer.class);

    public final NumberPath<Integer> numberChildrenBig = createNumber("numberChildrenBig", Integer.class);

    public final NumberPath<Integer> numberChildrenNormal = createNumber("numberChildrenNormal", Integer.class);

    public final NumberPath<Integer> numberChildrenSmall = createNumber("numberChildrenSmall", Integer.class);

    public final QProductTourEntity productTourEntity;

    public final StringPath seo = createString("seo");

    //inherited
    public final BooleanPath status = _super.status;

    public final NumberPath<java.math.BigDecimal> total = createNumber("total", java.math.BigDecimal.class);

    //inherited
    public final NumberPath<Integer> updatedBy = _super.updatedBy;

    //inherited
    public final DateTimePath<java.util.Date> updatedDate = _super.updatedDate;

    public final QUserEntity user;

    public QSaleOrderEntity(String variable) {
        this(SaleOrderEntity.class, forVariable(variable), INITS);
    }

    public QSaleOrderEntity(Path<? extends SaleOrderEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSaleOrderEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSaleOrderEntity(PathMetadata metadata, PathInits inits) {
        this(SaleOrderEntity.class, metadata, inits);
    }

    public QSaleOrderEntity(Class<? extends SaleOrderEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productTourEntity = inits.isInitialized("productTourEntity") ? new QProductTourEntity(forProperty("productTourEntity"), inits.get("productTourEntity")) : null;
        this.user = inits.isInitialized("user") ? new QUserEntity(forProperty("user")) : null;
    }

}

