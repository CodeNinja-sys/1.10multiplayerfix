/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.e;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.CodeSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.apache.logging.log4j.core.e.h;
import org.apache.logging.log4j.core.e.i;
import org.apache.logging.log4j.core.e.m;
import org.apache.logging.log4j.core.e.n;
import org.apache.logging.log4j.d;

public class k
implements Serializable {
    private static final long a = -2752771578252251910L;
    private static final d b;
    private static final n c;
    private static final Method d;
    private static final Method e;
    private final k f;
    private final Throwable g;
    private final String h;
    private final i[] i;
    private int j;

    public k(Throwable throwable) {
        this.g = throwable;
        this.h = throwable.getClass().getName();
        HashMap hashMap = new HashMap();
        Stack stack = this.j();
        this.i = this.a(stack, hashMap, null, throwable.getStackTrace());
        this.f = throwable.getCause() == null ? null : new k(throwable, stack, hashMap, throwable.getCause());
        this.a(throwable);
    }

    private k(Throwable throwable, Stack stack, Map map, Throwable throwable2) {
        this.g = throwable2;
        this.h = throwable2.getClass().getName();
        this.i = this.a(stack, map, throwable.getStackTrace(), throwable2.getStackTrace());
        this.f = throwable2.getCause() == null ? null : new k(throwable, stack, map, throwable2.getCause());
        this.a(throwable2);
    }

    public Throwable a() {
        return this.g;
    }

    public k b() {
        return this.f;
    }

    public String c() {
        return this.h;
    }

    public int d() {
        return this.j;
    }

    public i[] e() {
        return this.i;
    }

    public String toString() {
        String string = this.g.getMessage();
        return string != null ? this.h + ": " + string : this.h;
    }

    public String f() {
        return this.a((List)null);
    }

    public String a(List list) {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f != null) {
            this.a(stringBuilder, this.f);
            stringBuilder.append("Wrapped by: ");
        }
        stringBuilder.append(this.toString());
        stringBuilder.append("\n");
        this.a(stringBuilder, 0, this.g.getStackTrace(), this.i, list);
        return stringBuilder.toString();
    }

    public void a(StringBuilder stringBuilder, k k2) {
        this.a(stringBuilder, k2, null);
    }

    public void a(StringBuilder stringBuilder, k k2, List list) {
        Throwable throwable;
        Throwable throwable2 = throwable = k2.b() != null ? k2.b().a() : null;
        if (throwable != null) {
            this.a(stringBuilder, k2.f);
            stringBuilder.append("Wrapped by: ");
        }
        stringBuilder.append(k2).append("\n");
        this.a(stringBuilder, k2.j, k2.a().getStackTrace(), k2.i, list);
    }

    public String g() {
        return this.b(null);
    }

    public String b(List list) {
        StringBuilder stringBuilder = new StringBuilder(this.h);
        String string = this.g.getMessage();
        if (string != null) {
            stringBuilder.append(": ").append(this.g.getMessage());
        }
        stringBuilder.append("\n");
        this.a(stringBuilder, 0, this.g.getStackTrace(), this.i, list);
        if (this.f != null) {
            this.b(stringBuilder, this.f, list);
        }
        return stringBuilder.toString();
    }

    public String h() {
        k[] arrk = this.i();
        if (arrk == null || arrk.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder("Suppressed Stack Trace Elements:\n");
        for (k k2 : arrk) {
            stringBuilder.append(k2.g());
        }
        return stringBuilder.toString();
    }

    private void b(StringBuilder stringBuilder, k k2, List list) {
        stringBuilder.append("Caused by: ").append(k2).append("\n");
        this.a(stringBuilder, k2.j, k2.a().getStackTrace(), k2.i, list);
        if (k2.b() != null) {
            this.b(stringBuilder, k2.f, list);
        }
    }

    private void a(StringBuilder stringBuilder, int n2, StackTraceElement[] arrstackTraceElement, i[] arri, List list) {
        if (list == null || list.size() == 0) {
            for (int i2 = 0; i2 < arri.length; ++i2) {
                this.a(arrstackTraceElement[i2], arri[i2], stringBuilder);
            }
        } else {
            int n3 = 0;
            for (int i3 = 0; i3 < arri.length; ++i3) {
                if (!this.a(arrstackTraceElement[i3], list)) {
                    if (n3 > 0) {
                        if (n3 == 1) {
                            stringBuilder.append("\t....\n");
                        } else {
                            stringBuilder.append("\t... suppressed ").append(n3).append(" lines\n");
                        }
                        n3 = 0;
                    }
                    this.a(arrstackTraceElement[i3], arri[i3], stringBuilder);
                    continue;
                }
                ++n3;
            }
            if (n3 > 0) {
                if (n3 == 1) {
                    stringBuilder.append("\t...\n");
                } else {
                    stringBuilder.append("\t... suppressed ").append(n3).append(" lines\n");
                }
            }
        }
        if (n2 != 0) {
            stringBuilder.append("\t... ").append(n2).append(" more").append("\n");
        }
    }

    private void a(StackTraceElement stackTraceElement, i i2, StringBuilder stringBuilder) {
        stringBuilder.append("\tat ");
        stringBuilder.append(stackTraceElement);
        stringBuilder.append(" ");
        stringBuilder.append(i2);
        stringBuilder.append("\n");
    }

    private boolean a(StackTraceElement stackTraceElement, List list) {
        String string = stackTraceElement.getClassName();
        for (String string2 : list) {
            if (!string.startsWith(string2)) continue;
            return true;
        }
        return false;
    }

    private Stack j() {
        if (org.apache.logging.log4j.core.e.h.a()) {
            Stack<Class> stack = new Stack<Class>();
            int n2 = 1;
            Class class_ = org.apache.logging.log4j.core.e.h.a(n2);
            while (class_ != null) {
                stack.push(class_);
                class_ = org.apache.logging.log4j.core.e.h.a(++n2);
            }
            return stack;
        }
        if (c != null) {
            Class[] arrclass = c.a();
            Stack<Class> stack = new Stack<Class>();
            for (Class class_ : arrclass) {
                stack.push(class_);
            }
            return stack;
        }
        return new Stack();
    }

    i[] a(Stack stack, Map map, StackTraceElement[] arrstackTraceElement, StackTraceElement[] arrstackTraceElement2) {
        int n2;
        if (arrstackTraceElement != null) {
            int n3;
            int n4 = arrstackTraceElement.length - 1;
            for (n3 = arrstackTraceElement2.length - 1; n4 >= 0 && n3 >= 0 && arrstackTraceElement[n4].equals(arrstackTraceElement2[n3]); --n4, --n3) {
            }
            this.j = arrstackTraceElement2.length - 1 - n3;
            n2 = n3 + 1;
        } else {
            this.j = 0;
            n2 = arrstackTraceElement2.length;
        }
        i[] arri = new i[n2];
        Class class_ = stack.isEmpty() ? null : (Class)stack.peek();
        ClassLoader classLoader = null;
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            m m2;
            String string = arrstackTraceElement2[i2].getClassName();
            if (class_ != null && string.equals(class_.getName())) {
                m2 = this.a(class_, true);
                arri[i2] = m.a(m2);
                classLoader = m.b(m2);
                stack.pop();
                class_ = stack.isEmpty() ? null : (Class)stack.peek();
                continue;
            }
            if (map.containsKey(string)) {
                m2 = (m)map.get(string);
                arri[i2] = m.a(m2);
                if (m.b(m2) == null) continue;
                classLoader = m.b(m2);
                continue;
            }
            m2 = this.a(this.a(classLoader, string), false);
            arri[i2] = m.a(m2);
            map.put(string, m2);
            if (m.b(m2) == null) continue;
            classLoader = m.b(m2);
        }
        return arri;
    }

    private m a(Class class_, boolean bl2) {
        String string = "?";
        Object object = "?";
        ClassLoader classLoader = null;
        if (class_ != null) {
            Object object2;
            Object object3;
            try {
                object3 = class_.getProtectionDomain().getCodeSource();
                if (object3 != null && (object2 = ((CodeSource)object3).getLocation()) != null) {
                    String string2 = ((URL)object2).toString().replace('\\', '/');
                    int n2 = string2.lastIndexOf("/");
                    if (n2 >= 0 && n2 == string2.length() - 1) {
                        n2 = string2.lastIndexOf("/", n2 - 1);
                        string = string2.substring(n2 + 1);
                    } else {
                        string = string2.substring(n2 + 1);
                    }
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            object3 = class_.getPackage();
            if (object3 != null && (object2 = ((Package)object3).getImplementationVersion()) != null) {
                object = object2;
            }
            classLoader = class_.getClassLoader();
        }
        return new m(this, new i(string, (String)object, bl2), classLoader);
    }

    private Class a(ClassLoader classLoader, String string) {
        Class<?> class_;
        if (classLoader != null) {
            try {
                class_ = classLoader.loadClass(string);
                if (class_ != null) {
                    return class_;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        try {
            class_ = Thread.currentThread().getContextClassLoader().loadClass(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            try {
                class_ = Class.forName(string);
            }
            catch (ClassNotFoundException classNotFoundException2) {
                try {
                    class_ = this.getClass().getClassLoader().loadClass(string);
                }
                catch (ClassNotFoundException classNotFoundException3) {
                    return null;
                }
            }
        }
        return class_;
    }

    public k[] i() {
        if (d != null) {
            try {
                return (k[])d.invoke(this.g, new Object[0]);
            }
            catch (Exception exception) {
                return null;
            }
        }
        return null;
    }

    private void a(Throwable throwable) {
        if (d != null && e != null) {
            try {
                Throwable[] arrthrowable;
                for (Throwable throwable2 : arrthrowable = (Throwable[])d.invoke(throwable, new Object[0])) {
                    e.invoke(this, new k(throwable2));
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    static {
        Method[] arrmethod;
        Object object;
        b = org.apache.logging.log4j.d.d.k();
        if (org.apache.logging.log4j.core.e.h.a()) {
            c = null;
        } else {
            try {
                object = new n(null);
                if (((n)object).a() == null) {
                    object = null;
                    b.b("Unable to obtain call stack from security manager.");
                }
            }
            catch (Exception exception) {
                object = null;
                b.a("Unable to install security manager.", (Throwable)exception);
            }
            c = object;
        }
        object = null;
        Method method = null;
        for (Method method2 : arrmethod = Throwable.class.getMethods()) {
            if (method2.getName().equals("getSuppressed")) {
                object = method2;
                continue;
            }
            if (!method2.getName().equals("addSuppressed")) continue;
            method = method2;
        }
        d = object;
        e = method;
    }
}

