/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.a;

import java.lang.reflect.Method;
import java.sql.Connection;
import javax.sql.DataSource;
import org.apache.logging.log4j.core.a.a.a.b;
import org.apache.logging.log4j.core.a.a.a.f;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.d;

public final class e
implements b {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private final DataSource b;
    private final String c;

    private e(DataSource dataSource, String string, String string2, String string3) {
        this.b = dataSource;
        this.c = "factory{ public static " + string3 + " " + string + "." + string2 + "() }";
    }

    @Override
    public Connection a() {
        return this.b.getConnection();
    }

    @Override
    public String toString() {
        return this.c;
    }

    public static e a(String string, String string2) {
        DataSource dataSource;
        Method method;
        Class<?> class_;
        if (v.a(string) || v.a(string2)) {
            a.b("No class name or method name specified for the connection factory method.");
            return null;
        }
        try {
            class_ = Class.forName(string);
            method = class_.getMethod(string2, new Class[0]);
        }
        catch (Exception exception) {
            a.b(exception.toString(), (Throwable)exception);
            return null;
        }
        class_ = method.getReturnType();
        String string3 = class_.getName();
        if (class_ == DataSource.class) {
            try {
                dataSource = (DataSource)method.invoke(null, new Object[0]);
                string3 = string3 + "[" + dataSource + "]";
            }
            catch (Exception exception) {
                a.b(exception.toString(), (Throwable)exception);
                return null;
            }
        } else if (class_ == Connection.class) {
            dataSource = new f(method);
        } else {
            a.b("Method [{}.{}()] returns unsupported type [{}].", string, string2, class_.getName());
            return null;
        }
        return new e(dataSource, string, string2, string3);
    }
}

