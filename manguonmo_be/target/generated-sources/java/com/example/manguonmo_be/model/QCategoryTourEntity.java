package com.example.manguonmo_be.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCategoryTourEntity is a Querydsl query type for CategoryTourEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCategoryTourEntity extends EntityPathBase<CategoryTourEntity> {

    private static final long serialVersionUID = -805407902L;

    public static final QCategoryTourEntity categoryTourEntity = new QCategoryTourEntity("categoryTourEntity");

    public final QAttributesCommon _super = new QAttributesCommon(this);

    public final StringPath categoryTourAvatar = createString("categoryTourAvatar");

    public final BooleanPath categoryTourIsLove = createBoolean("categoryTourIsLove");

    public final StringPath categoryTourName = createString("categoryTourName");

    public final NumberPath<Integer> categoryTourNumberGuest = createNumber("categoryTourNumberGuest", Integer.class);

    //inherited
    public final NumberPath<Integer> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final SetPath<ProductTourEntity, QProductTourEntity> productTourEntities = this.<ProductTourEntity, QProductTourEntity>createSet("productTourEntities", ProductTourEntity.class, QProductTourEntity.class, PathInits.DIRECT2);

    //inherited
    public final BooleanPath status = _super.status;

    //inherited
    public final NumberPath<Integer> updatedBy = _super.updatedBy;

    //inherited
    public final DateTimePath<java.util.Date> updatedDate = _super.updatedDate;

    public QCategoryTourEntity(String variable) {
        super(CategoryTourEntity.class, forVariable(variable));
    }

    public QCategoryTourEntity(Path<? extends CategoryTourEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCategoryTourEntity(PathMetadata metadata) {
        super(CategoryTourEntity.class, metadata);
    }

}

