package com.example.manguonmo_be.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserEntity is a Querydsl query type for UserEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserEntity extends EntityPathBase<UserEntity> {

    private static final long serialVersionUID = -1416472585L;

    public static final QUserEntity userEntity = new QUserEntity("userEntity");

    public final QAttributesCommon _super = new QAttributesCommon(this);

    //inherited
    public final NumberPath<Integer> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath email = createString("email");

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final BooleanPath isAdmin = createBoolean("isAdmin");

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final SetPath<RoleEntity, QRoleEntity> roles = this.<RoleEntity, QRoleEntity>createSet("roles", RoleEntity.class, QRoleEntity.class, PathInits.DIRECT2);

    public final SetPath<SaleOrderEntity, QSaleOrderEntity> saleOrders = this.<SaleOrderEntity, QSaleOrderEntity>createSet("saleOrders", SaleOrderEntity.class, QSaleOrderEntity.class, PathInits.DIRECT2);

    public final StringPath shippingAddress = createString("shippingAddress");

    //inherited
    public final BooleanPath status = _super.status;

    //inherited
    public final NumberPath<Integer> updatedBy = _super.updatedBy;

    //inherited
    public final DateTimePath<java.util.Date> updatedDate = _super.updatedDate;

    public final StringPath username = createString("username");

    public QUserEntity(String variable) {
        super(UserEntity.class, forVariable(variable));
    }

    public QUserEntity(Path<? extends UserEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserEntity(PathMetadata metadata) {
        super(UserEntity.class, metadata);
    }

}

