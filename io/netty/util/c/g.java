/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javassist.ClassClassPath
 *  javassist.ClassPath
 *  javassist.ClassPool
 *  javassist.CtClass
 */
package io.netty.util.c;

import io.netty.util.c.aj;
import io.netty.util.c.b.h;
import io.netty.util.c.q;
import io.netty.util.c.u;
import java.lang.reflect.Method;
import javassist.ClassClassPath;
import javassist.ClassPath;
import javassist.ClassPool;
import javassist.CtClass;

public final class g {
    private static final io.netty.util.c.b.g a = h.a(g.class);
    private static final ClassPool b = new ClassPool(true);

    public static void a(ClassPath classPath) {
        b.appendClassPath(classPath);
    }

    public static void a(String string) {
        b.appendClassPath(string);
    }

    public static aj a(Class class_) {
        ClassLoader classLoader = u.o();
        if (classLoader == null) {
            classLoader = u.p();
        }
        return g.a(class_, classLoader);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static aj a(Class class_, ClassLoader classLoader) {
        String string = g.b(class_);
        String string2 = "io.netty.util.internal.__matchers__." + string + "Matcher";
        try {
            return (aj)Class.forName(string2, true, classLoader).newInstance();
        }
        catch (Exception exception) {
            try {
                CtClass ctClass = b.getAndRename(q.class.getName(), string2);
                ctClass.setModifiers(ctClass.getModifiers() | 0x10);
                ctClass.getDeclaredMethod("match").setBody("{ return $1 instanceof " + string + "; }");
                byte[] arrby = ctClass.toBytecode();
                ctClass.detach();
                Method method = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, Integer.TYPE, Integer.TYPE);
                method.setAccessible(true);
                Class class_2 = (Class)method.invoke(classLoader, string2, arrby, 0, arrby.length);
                if (class_ != Object.class) {
                    a.b("Generated: {}", (Object)class_2.getName());
                }
                return (aj)class_2.newInstance();
            }
            catch (Exception exception2) {
                throw new RuntimeException(exception2);
            }
        }
    }

    private static String b(Class class_) {
        if (class_.isArray()) {
            return g.b(class_.getComponentType()) + "[]";
        }
        return class_.getName();
    }

    private g() {
    }

    static {
        b.appendClassPath((ClassPath)new ClassClassPath(q.class));
    }
}

