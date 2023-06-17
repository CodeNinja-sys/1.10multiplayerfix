/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.al;
import com.a.b.b.am;
import com.a.b.b.an;
import com.a.b.b.ao;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class ak {
    public abstract Object a(Class var1);

    public static ak a() {
        try {
            Class<?> class_ = Class.forName("sun.misc.Unsafe");
            Field field = class_.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Object object = field.get(null);
            Method method = class_.getMethod("allocateInstance", Class.class);
            return new al(method, object);
        }
        catch (Exception exception) {
            try {
                Method method = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                method.setAccessible(true);
                return new am(method);
            }
            catch (Exception exception2) {
                try {
                    Method method = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    method.setAccessible(true);
                    int n2 = (Integer)method.invoke(null, Object.class);
                    Method method2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    method2.setAccessible(true);
                    return new an(method2, n2);
                }
                catch (Exception exception3) {
                    return new ao();
                }
            }
        }
    }
}

