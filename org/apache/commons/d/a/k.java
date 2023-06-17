/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.servlet.ServletContextEvent
 *  javax.servlet.ServletContextListener
 */
package org.apache.commons.d.a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.commons.d.c;

public class k
implements ServletContextListener {
    private static final Class[] b = new Class[]{a == null ? (a = k.a("java.lang.ClassLoader")) : a};
    static Class a;

    public void a(ServletContextEvent servletContextEvent) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Object[] arrobject = new Object[]{classLoader};
        ClassLoader classLoader2 = classLoader;
        while (classLoader2 != null) {
            try {
                Class<?> class_ = classLoader2.loadClass("org.apache.commons.logging.LogFactory");
                Method method = class_.getMethod("release", b);
                method.invoke(null, arrobject);
                classLoader2 = class_.getClassLoader().getParent();
            }
            catch (ClassNotFoundException classNotFoundException) {
                classLoader2 = null;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                System.err.println("LogFactory instance found which does not support release method!");
                classLoader2 = null;
            }
            catch (IllegalAccessException illegalAccessException) {
                System.err.println("LogFactory instance found which is not accessable!");
                classLoader2 = null;
            }
            catch (InvocationTargetException invocationTargetException) {
                System.err.println("LogFactory instance release method failed!");
                classLoader2 = null;
            }
        }
        c.a(classLoader);
    }

    public void b(ServletContextEvent servletContextEvent) {
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }
}

