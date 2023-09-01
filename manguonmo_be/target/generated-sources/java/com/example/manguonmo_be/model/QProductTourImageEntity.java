package com.example.manguonmo_be.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductTourImageEntity is a Querydsl query type for ProductTourImageEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductTourImageEntity extends EntityPathBase<ProductTourImageEntity> {

    private static final long serialVersionUID = -1012745824L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductTourImageEntity productTourImageEntity = new QProductTourImageEntity("productTourImageEntity");

    public final QAttributesCommon _super = new QAttributesCommon(this);

    //inherited
    public final NumberPath<Integer> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final QProductTourEntity productTourEntity;

    public final StringPath productTourImagePath = createString("productTourImagePath");

    public final StringPath productTourImageTiltle = createString("productTourImageTiltle");

    //inherited
    public final BooleanPath status = _super.status;

    //inherited
    public final NumberPath<Integer> updatedBy = _super.updatedBy;

    //inherited
    public final DateTimePath<java.util.Date> updatedDate = _super.updatedDate;

    public QProductTourImageEntity(String variable) {
        this(ProductTourImageEntity.class, forVariable(variable), INITS);
    }

    public QProductTourImageEntity(Path<? extends ProductTourImageEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductTourImageEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductTourImageEntity(PathMetadata metadata, PathInits inits) {
        this(ProductTourImageEntity.class, metadata, inits);
    }

    public QProductTourImageEntity(Class<? extends ProductTourImageEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productTourEntity = inits.isInitialized("productTourEntity") ? new QProductTourEntity(forProperty("productTourEntity"), inits.get("productTourEntity")) : null;
    }

}

