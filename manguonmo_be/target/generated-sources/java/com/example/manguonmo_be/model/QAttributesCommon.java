package com.example.manguonmo_be.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAttributesCommon is a Querydsl query type for AttributesCommon
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QAttributesCommon extends EntityPathBase<AttributesCommon> {

    private static final long serialVersionUID = 123162571L;

    public static final QAttributesCommon attributesCommon = new QAttributesCommon("attributesCommon");

    public final NumberPath<Integer> createdBy = createNumber("createdBy", Integer.class);

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath status = createBoolean("status");

    public final NumberPath<Integer> updatedBy = createNumber("updatedBy", Integer.class);

    public final DateTimePath<java.util.Date> updatedDate = createDateTime("updatedDate", java.util.Date.class);

    public QAttributesCommon(String variable) {
        super(AttributesCommon.class, forVariable(variable));
    }

    public QAttributesCommon(Path<? extends AttributesCommon> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAttributesCommon(PathMetadata metadata) {
        super(AttributesCommon.class, metadata);
    }

}

