package com.example.manguonmo_be.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDayEntity is a Querydsl query type for DayEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDayEntity extends EntityPathBase<DayEntity> {

    private static final long serialVersionUID = 708582678L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDayEntity dayEntity = new QDayEntity("dayEntity");

    public final QAttributesCommon _super = new QAttributesCommon(this);

    //inherited
    public final NumberPath<Integer> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath dayContent = createString("dayContent");

    public final StringPath dayName = createString("dayName");

    public final NumberPath<Integer> dayNumber = createNumber("dayNumber", Integer.class);

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final QProductTourEntity productTourEntityDay;

    //inherited
    public final BooleanPath status = _super.status;

    //inherited
    public final NumberPath<Integer> updatedBy = _super.updatedBy;

    //inherited
    public final DateTimePath<java.util.Date> updatedDate = _super.updatedDate;

    public QDayEntity(String variable) {
        this(DayEntity.class, forVariable(variable), INITS);
    }

    public QDayEntity(Path<? extends DayEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDayEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDayEntity(PathMetadata metadata, PathInits inits) {
        this(DayEntity.class, metadata, inits);
    }

    public QDayEntity(Class<? extends DayEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productTourEntityDay = inits.isInitialized("productTourEntityDay") ? new QProductTourEntity(forProperty("productTourEntityDay"), inits.get("productTourEntityDay")) : null;
    }

}

