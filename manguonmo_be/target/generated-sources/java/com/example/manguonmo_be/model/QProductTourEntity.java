package com.example.manguonmo_be.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductTourEntity is a Querydsl query type for ProductTourEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductTourEntity extends EntityPathBase<ProductTourEntity> {

    private static final long serialVersionUID = -539678175L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductTourEntity productTourEntity = new QProductTourEntity("productTourEntity");

    public final QAttributesCommon _super = new QAttributesCommon(this);

    public final QCategoryTourEntity categoryTourEntity;

    //inherited
    public final NumberPath<Integer> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final SetPath<DayEntity, QDayEntity> dayEntities = this.<DayEntity, QDayEntity>createSet("dayEntities", DayEntity.class, QDayEntity.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final StringPath productTourAddressStart = createString("productTourAddressStart");

    public final NumberPath<Float> productTourAssess = createNumber("productTourAssess", Float.class);

    public final StringPath productTourAvatar = createString("productTourAvatar");

    public final StringPath productTourCode = createString("productTourCode");

    public final StringPath productTourHighlightTour = createString("productTourHighlightTour");

    public final SetPath<ProductTourImageEntity, QProductTourImageEntity> productTourImageEntitySet = this.<ProductTourImageEntity, QProductTourImageEntity>createSet("productTourImageEntitySet", ProductTourImageEntity.class, QProductTourImageEntity.class, PathInits.DIRECT2);

    public final BooleanPath productTourIsHot = createBoolean("productTourIsHot");

    public final BooleanPath productTourIsSale = createBoolean("productTourIsSale");

    public final StringPath productTourName = createString("productTourName");

    public final StringPath productTourNameDetail = createString("productTourNameDetail");

    public final NumberPath<java.math.BigDecimal> productTourPrice = createNumber("productTourPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> productTourPriceSale = createNumber("productTourPriceSale", java.math.BigDecimal.class);

    public final StringPath productTourServiceTour = createString("productTourServiceTour");

    public final StringPath productTourTime = createString("productTourTime");

    public final StringPath productTourTimeStart = createString("productTourTimeStart");

    public final StringPath productTourVehicle = createString("productTourVehicle");

    public final StringPath seo = createString("seo");

    //inherited
    public final BooleanPath status = _super.status;

    //inherited
    public final NumberPath<Integer> updatedBy = _super.updatedBy;

    //inherited
    public final DateTimePath<java.util.Date> updatedDate = _super.updatedDate;

    public QProductTourEntity(String variable) {
        this(ProductTourEntity.class, forVariable(variable), INITS);
    }

    public QProductTourEntity(Path<? extends ProductTourEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductTourEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductTourEntity(PathMetadata metadata, PathInits inits) {
        this(ProductTourEntity.class, metadata, inits);
    }

    public QProductTourEntity(Class<? extends ProductTourEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.categoryTourEntity = inits.isInitialized("categoryTourEntity") ? new QCategoryTourEntity(forProperty("categoryTourEntity")) : null;
    }

}

