/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.d.jl;
import com.a.a.d.jn;
import com.a.a.d.jt;
import com.a.a.d.lo;
import com.a.a.d.lp;
import com.a.a.l.z;
import com.a.a.m.ab;
import com.a.a.m.af;
import com.a.a.m.ag;
import com.a.a.m.ah;
import com.a.a.m.ai;
import com.a.a.m.am;
import com.a.a.m.aw;
import com.a.a.m.ay;
import com.a.a.m.bh;
import com.a.a.m.k;
import com.a.a.m.u;
import com.a.a.m.v;
import com.a.a.m.w;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

public abstract class ae
extends u
implements Serializable {
    private final Type a;
    private transient w b;

    protected ae() {
        this.a = this.a();
        cl.b(!(this.a instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", this.a);
    }

    protected ae(Class class_) {
        Type type = super.a();
        this.a = type instanceof Class ? type : ae.a((Class)class_).b((Type)type).a;
    }

    private ae(Type type) {
        this.a = (Type)cl.a(type);
    }

    public static ae a(Class class_) {
        return new am((Type)class_);
    }

    public static ae a(Type type) {
        return new am(type);
    }

    public final Class b() {
        Class class_;
        Class class_2 = class_ = ae.d(this.a);
        return class_2;
    }

    private lo n() {
        lo lo2 = ae.e(this.a);
        return lo2;
    }

    public final Type c() {
        return this.a;
    }

    public final ae a(v v2, ae ae2) {
        w w2 = new w().a(jt.c(new ab(v2.a), ae2.a));
        return new am(w2.b(this.a));
    }

    public final ae a(v v2, Class class_) {
        return this.a(v2, ae.a(class_));
    }

    public final ae b(Type type) {
        cl.a(type);
        w w2 = this.b;
        if (w2 == null) {
            w2 = this.b = w.a(this.a);
        }
        return ae.a(w2.b(type));
    }

    private Type[] a(Type[] arrtype) {
        for (int i2 = 0; i2 < arrtype.length; ++i2) {
            arrtype[i2] = this.b(arrtype[i2]).c();
        }
        return arrtype;
    }

    private ae f(Type type) {
        ae ae2 = this.b(type);
        ae2.b = this.b;
        return ae2;
    }

    final ae d() {
        if (this.a instanceof TypeVariable) {
            return this.g(((TypeVariable)this.a).getBounds()[0]);
        }
        if (this.a instanceof WildcardType) {
            return this.g(((WildcardType)this.a).getUpperBounds()[0]);
        }
        Type type = this.b().getGenericSuperclass();
        if (type == null) {
            return null;
        }
        ae ae2 = this.f(type);
        return ae2;
    }

    private ae g(Type type) {
        ae ae2 = ae.a(type);
        if (ae2.b().isInterface()) {
            return null;
        }
        ae ae3 = ae2;
        return ae3;
    }

    final jl e() {
        if (this.a instanceof TypeVariable) {
            return this.b(((TypeVariable)this.a).getBounds());
        }
        if (this.a instanceof WildcardType) {
            return this.b(((WildcardType)this.a).getUpperBounds());
        }
        jn jn2 = jl.g();
        for (Type type : this.b().getGenericInterfaces()) {
            ae ae2 = this.f(type);
            jn2.c(ae2);
        }
        return jn2.b();
    }

    private jl b(Type[] arrtype) {
        jn jn2 = jl.g();
        for (Type type : arrtype) {
            ae ae2 = ae.a(type);
            if (!ae2.b().isInterface()) continue;
            jn2.c(ae2);
        }
        return jn2.b();
    }

    public final aw f() {
        return new aw(this);
    }

    public final ae b(Class class_) {
        cl.a(class_.isAssignableFrom(this.b()), "%s is not a super class of %s", new Object[]{class_, this});
        if (this.a instanceof TypeVariable) {
            return this.a(class_, ((TypeVariable)this.a).getBounds());
        }
        if (this.a instanceof WildcardType) {
            return this.a(class_, ((WildcardType)this.a).getUpperBounds());
        }
        if (class_.isArray()) {
            return this.e(class_);
        }
        ae ae2 = this.f(ae.d((Class)class_).a);
        return ae2;
    }

    public final ae c(Class class_) {
        cl.a(!(this.a instanceof TypeVariable), "Cannot get subtype of type variable <%s>", new Object[]{this});
        if (this.a instanceof WildcardType) {
            return this.b(class_, ((WildcardType)this.a).getLowerBounds());
        }
        cl.a(this.b().isAssignableFrom(class_), "%s isn't a subclass of %s", new Object[]{class_, this});
        if (this.g()) {
            return this.f(class_);
        }
        ae ae2 = ae.a(this.g(class_));
        return ae2;
    }

    public final boolean a(ae ae2) {
        return this.c(ae2.a);
    }

    public final boolean c(Type type) {
        return ae.a((Type)cl.a(type), this.a);
    }

    public final boolean g() {
        return this.k() != null;
    }

    public final boolean h() {
        return this.a instanceof Class && ((Class)this.a).isPrimitive();
    }

    public final ae i() {
        if (this.h()) {
            Class class_ = (Class)this.a;
            return ae.a(z.b(class_));
        }
        return this;
    }

    private boolean o() {
        return z.b().contains(this.a);
    }

    public final ae j() {
        if (this.o()) {
            Class class_ = (Class)this.a;
            return ae.a(z.c(class_));
        }
        return this;
    }

    public final ae k() {
        Type type = ay.e(this.a);
        if (type == null) {
            return null;
        }
        return ae.a(type);
    }

    public final k a(Method method) {
        cl.a(ae.a(method.getDeclaringClass()).a(this), "%s not declared by %s", new Object[]{method, this});
        return new af(this, method);
    }

    public final k a(Constructor constructor) {
        cl.a(constructor.getDeclaringClass() == this.b(), "%s not declared by %s", new Object[]{constructor, this.b()});
        return new ag(this, constructor);
    }

    public boolean equals(Object object) {
        if (object instanceof ae) {
            ae ae2 = (ae)object;
            return this.a.equals(ae2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return ay.d(this.a);
    }

    protected Object l() {
        return ae.a(new w().b(this.a));
    }

    final ae m() {
        new ah(this).a(this.a);
        return this;
    }

    private static boolean a(Type type, Type type2) {
        if (type2.equals(type)) {
            return true;
        }
        if (type2 instanceof WildcardType) {
            return ae.a(type, (WildcardType)type2);
        }
        if (type instanceof TypeVariable) {
            return ae.a(((TypeVariable)type).getBounds(), type2);
        }
        if (type instanceof WildcardType) {
            return ae.a(((WildcardType)type).getUpperBounds(), type2);
        }
        if (type instanceof GenericArrayType) {
            return ae.a((GenericArrayType)type, type2);
        }
        if (type2 instanceof Class) {
            return ae.a(type, (Class)type2);
        }
        if (type2 instanceof ParameterizedType) {
            return ae.a(type, (ParameterizedType)type2);
        }
        if (type2 instanceof GenericArrayType) {
            return ae.a(type, (GenericArrayType)type2);
        }
        return false;
    }

    private static boolean a(Type[] arrtype, Type type) {
        for (Type type2 : arrtype) {
            if (!ae.a(type2, type)) continue;
            return true;
        }
        return false;
    }

    private static boolean a(Type type, Class class_) {
        return class_.isAssignableFrom(ae.d(type));
    }

    private static boolean a(Type type, WildcardType wildcardType) {
        return ae.a(type, ae.a(wildcardType)) && ae.b(type, wildcardType);
    }

    private static boolean b(Type type, WildcardType wildcardType) {
        Type type2 = ae.b(wildcardType);
        if (type2 == null) {
            return true;
        }
        Type type3 = ae.i(type);
        if (type3 == null) {
            return false;
        }
        return ae.a(type2, type3);
    }

    private static boolean a(Type type, ParameterizedType parameterizedType) {
        Class class_ = ae.d(parameterizedType);
        if (!class_.isAssignableFrom(ae.d(type))) {
            return false;
        }
        TypeVariable<Class<T>>[] arrtypeVariable = class_.getTypeParameters();
        Type[] arrtype = parameterizedType.getActualTypeArguments();
        ae ae2 = ae.a(type);
        for (int i2 = 0; i2 < arrtypeVariable.length; ++i2) {
            Type type2 = ae2.b(arrtypeVariable[i2]).a;
            if (ae.b(type2, arrtype[i2])) continue;
            return false;
        }
        return true;
    }

    private static boolean a(Type type, GenericArrayType genericArrayType) {
        if (type instanceof Class) {
            Class class_ = (Class)type;
            if (!class_.isArray()) {
                return false;
            }
            return ae.a(class_.getComponentType(), genericArrayType.getGenericComponentType());
        }
        if (type instanceof GenericArrayType) {
            GenericArrayType genericArrayType2 = (GenericArrayType)type;
            return ae.a(genericArrayType2.getGenericComponentType(), genericArrayType.getGenericComponentType());
        }
        return false;
    }

    private static boolean a(GenericArrayType genericArrayType, Type type) {
        if (type instanceof Class) {
            Class class_ = (Class)type;
            if (!class_.isArray()) {
                return class_ == Object.class;
            }
            return ae.a(genericArrayType.getGenericComponentType(), class_.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            GenericArrayType genericArrayType2 = (GenericArrayType)type;
            return ae.a(genericArrayType.getGenericComponentType(), genericArrayType2.getGenericComponentType());
        }
        return false;
    }

    private static boolean b(Type type, Type type2) {
        if (type.equals(type2)) {
            return true;
        }
        if (type2 instanceof WildcardType) {
            return ae.a(type, (WildcardType)type2);
        }
        return false;
    }

    private static Type h(Type type) {
        if (type instanceof WildcardType) {
            return ae.a((WildcardType)type);
        }
        return type;
    }

    private static Type a(WildcardType wildcardType) {
        Type[] arrtype = wildcardType.getUpperBounds();
        if (arrtype.length == 1) {
            return ae.h(arrtype[0]);
        }
        if (arrtype.length == 0) {
            return Object.class;
        }
        throw new AssertionError((Object)("There should be at most one upper bound for wildcard type: " + wildcardType));
    }

    private static Type i(Type type) {
        if (type instanceof WildcardType) {
            return ae.b((WildcardType)type);
        }
        return type;
    }

    private static Type b(WildcardType wildcardType) {
        Type[] arrtype = wildcardType.getLowerBounds();
        if (arrtype.length == 1) {
            return ae.i(arrtype[0]);
        }
        if (arrtype.length == 0) {
            return null;
        }
        throw new AssertionError((Object)("Wildcard should have at most one lower bound: " + wildcardType));
    }

    static Class d(Type type) {
        return (Class)ae.e(type).aO_().next();
    }

    static lo e(Type type) {
        cl.a(type);
        lp lp2 = lo.k();
        new ai(lp2).a(type);
        return lp2.b();
    }

    static ae d(Class class_) {
        if (class_.isArray()) {
            Type type = ay.a(ae.d(class_.getComponentType()).a);
            ae ae2 = ae.a(type);
            return ae2;
        }
        Type[] arrtype = class_.getTypeParameters();
        if (arrtype.length > 0) {
            ae ae3 = ae.a(ay.a(class_, arrtype));
            return ae3;
        }
        return ae.a(class_);
    }

    private ae a(Class class_, Type[] arrtype) {
        for (Type type : arrtype) {
            ae ae2 = ae.a(type);
            if (!ae.a(class_).a(ae2)) continue;
            ae ae3 = ae2.b(class_);
            return ae3;
        }
        throw new IllegalArgumentException(class_ + " isn't a super type of " + this);
    }

    private ae b(Class class_, Type[] arrtype) {
        int n2 = 0;
        Type[] arrtype2 = arrtype;
        int n3 = arrtype2.length;
        if (n2 < n3) {
            Type type = arrtype2[n2];
            ae ae2 = ae.a(type);
            return ae2.c(class_);
        }
        throw new IllegalArgumentException(class_ + " isn't a subclass of " + this);
    }

    private ae e(Class class_) {
        ae ae2 = (ae)cl.a(this.k(), "%s isn't a super type of %s", class_, this);
        ae ae3 = ae2.b(class_.getComponentType());
        ae ae4 = ae.a(ae.j(ae3.a));
        return ae4;
    }

    private ae f(Class class_) {
        ae ae2 = this.k().c(class_.getComponentType());
        ae ae3 = ae.a(ae.j(ae2.a));
        return ae3;
    }

    private Type g(Class class_) {
        if (this.a instanceof Class) {
            return class_;
        }
        ae ae2 = ae.d(class_);
        Type type = ae2.b((Class)this.b()).a;
        return new w().a(type, this.a).b(ae2.a);
    }

    private static Type j(Type type) {
        return bh.b.a(type);
    }

    static /* synthetic */ Type[] a(ae ae2, Type[] arrtype) {
        return ae2.a(arrtype);
    }

    static /* synthetic */ lo b(ae ae2) {
        return ae2.n();
    }

    static /* synthetic */ Type c(ae ae2) {
        return ae2.a;
    }

    /* synthetic */ ae(Type type, af af2) {
        this(type);
    }
}

