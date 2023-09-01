package com.example.manguonmo_be.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSystemPlanEntity is a Querydsl query type for SystemPlanEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSystemPlanEntity extends EntityPathBase<SystemPlanEntity> {

    private static final long serialVersionUID = 1370580388L;

    public static final QSystemPlanEntity systemPlanEntity = new QSystemPlanEntity("systemPlanEntity");

    public final QAttributesCommon _super = new QAttributesCommon(this);

    //inherited
    public final NumberPath<Integer> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final NumberPath<Integer> numberGuest = createNumber("numberGuest", Integer.class);

    public final NumberPath<Integer> numberGuide = createNumber("numberGuide", Integer.class);

    public final NumberPath<Integer> numberTour = createNumber("numberTour", Integer.class);

    public final NumberPath<Integer> numberTrip = createNumber("numberTrip", Integer.class);

    //inherited
    public final BooleanPath status = _super.status;

    //inherited
    public final NumberPath<Integer> updatedBy = _super.updatedBy;

    //inherited
    public final DateTimePath<java.util.Date> updatedDate = _super.updatedDate;

    public QSystemPlanEntity(String variable) {
        super(SystemPlanEntity.class, forVariable(variable));
    }

    public QSystemPlanEntity(Path<? extends SystemPlanEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSystemPlanEntity(PathMetadata metadata) {
        super(SystemPlanEntity.class, metadata);
    }

}

