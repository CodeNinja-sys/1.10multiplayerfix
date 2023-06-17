/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.ak;
import io.netty.util.c.f;
import io.netty.util.c.g;
import io.netty.util.c.q;
import io.netty.util.c.u;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public abstract class aj {
    private static final aj a = new q();
    private static final Object b = new Object();

    public static aj a(Class class_) {
        Map map = f.b().m();
        aj aj2 = (aj)map.get(class_);
        if (aj2 == null) {
            if (class_ == Object.class) {
                aj2 = a;
            } else if (u.i()) {
                try {
                    aj2 = g.a(class_);
                    aj2.a(b);
                }
                catch (IllegalAccessError illegalAccessError) {
                    aj2 = null;
                }
                catch (Exception exception) {
                    aj2 = null;
                }
            }
            if (aj2 == null) {
                aj2 = new ak(class_);
            }
            map.put(class_, aj2);
        }
        return aj2;
    }

    public static aj a(Object object, Class class_, String string) {
        aj aj2;
        Class<?> class_2;
        Map map = f.b().n();
        HashMap<String, aj> hashMap = (HashMap<String, aj>)map.get(class_2 = object.getClass());
        if (hashMap == null) {
            hashMap = new HashMap<String, aj>();
            map.put(class_2, hashMap);
        }
        if ((aj2 = (aj)hashMap.get(string)) == null) {
            aj2 = aj.a(aj.b(object, class_, string));
            hashMap.put(string, aj2);
        }
        return aj2;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static Class b(Object object, Class class_, String string) {
        Class<?> class_2;
        Class<?> class_3 = class_2 = object.getClass();
        while (true) {
            Type type;
            TypeVariable<Class<?>>[] arrtypeVariable;
            int n2;
            if (class_3.getSuperclass() == class_) {
                n2 = -1;
                arrtypeVariable = class_3.getSuperclass().getTypeParameters();
            } else {
                if ((class_3 = class_3.getSuperclass()) != null) continue;
                return aj.a(class_2, string);
            }
            for (int i2 = 0; i2 < arrtypeVariable.length; ++i2) {
                if (!string.equals(arrtypeVariable[i2].getName())) continue;
                n2 = i2;
                break;
            }
            if (n2 < 0) {
                throw new IllegalStateException("unknown type parameter '" + string + "': " + class_);
            }
            Type type2 = class_3.getGenericSuperclass();
            if (!(type2 instanceof ParameterizedType)) {
                return Object.class;
            }
            Type[] arrtype = ((ParameterizedType)type2).getActualTypeArguments();
            Type type3 = arrtype[n2];
            if (type3 instanceof ParameterizedType) {
                type3 = ((ParameterizedType)type3).getRawType();
            }
            if (type3 instanceof Class) {
                return (Class)type3;
            }
            if (type3 instanceof GenericArrayType) {
                type = ((GenericArrayType)type3).getGenericComponentType();
                if (type instanceof ParameterizedType) {
                    type = ((ParameterizedType)type).getRawType();
                }
                if (type instanceof Class) {
                    return Array.newInstance((Class)type, 0).getClass();
                }
            }
            if (!(type3 instanceof TypeVariable)) return aj.a(class_2, string);
            type = (TypeVariable)type3;
            class_3 = class_2;
            if (!(type.getGenericDeclaration() instanceof Class)) {
                return Object.class;
            }
            class_ = (Class)type.getGenericDeclaration();
            string = type.getName();
            if (!class_.isAssignableFrom(class_2)) return Object.class;
        }
    }

    private static Class a(Class class_, String string) {
        throw new IllegalStateException("cannot determine the type of the type parameter '" + string + "': " + class_);
    }

    public abstract boolean a(Object var1);

    protected aj() {
    }
}

