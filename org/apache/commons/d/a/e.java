/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d.a;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.util.Hashtable;
import org.apache.commons.d.a;
import org.apache.commons.d.a.f;
import org.apache.commons.d.a.g;
import org.apache.commons.d.a.h;
import org.apache.commons.d.b;
import org.apache.commons.d.c;

public class e
extends c {
    private static final String B = "org.apache.commons.logging.impl.Log4JLogger";
    private static final String C = "org.apache.commons.logging.impl.Jdk14Logger";
    private static final String D = "org.apache.commons.logging.impl.Jdk13LumberjackLogger";
    private static final String E = "org.apache.commons.logging.impl.SimpleLog";
    private static final String F = "org.apache.commons.logging.impl.";
    private static final int G = "org.apache.commons.logging.impl.".length();
    public static final String m = "org.apache.commons.d.a";
    protected static final String n = "org.apache.commons.logging.log";
    public static final String o = "org.apache.commons.logging.Log.allowFlawedContext";
    public static final String p = "org.apache.commons.logging.Log.allowFlawedDiscovery";
    public static final String q = "org.apache.commons.logging.Log.allowFlawedHierarchy";
    private static final String[] H = new String[]{"org.apache.commons.logging.impl.Log4JLogger", "org.apache.commons.logging.impl.Jdk14Logger", "org.apache.commons.logging.impl.Jdk13LumberjackLogger", "org.apache.commons.logging.impl.SimpleLog"};
    private boolean I = true;
    private String J;
    protected Hashtable r = new Hashtable();
    protected Hashtable s = new Hashtable();
    private String K;
    protected Constructor t = null;
    protected Class[] u = new Class[]{x == null ? (x = org.apache.commons.d.a.e.j("java.lang.String")) : x};
    protected Method v = null;
    protected Class[] w = new Class[]{y == null ? (y = org.apache.commons.d.a.e.j("org.apache.commons.d.c")) : y};
    private boolean L;
    private boolean M;
    private boolean N;
    static Class x;
    static Class y;
    static Class z;
    static Class A;

    public e() {
        this.p();
        if (org.apache.commons.d.a.e.i()) {
            this.h("Instance created.");
        }
    }

    public Object a(String string) {
        return this.r.get(string);
    }

    public String[] a() {
        return this.r.keySet().toArray(new String[this.r.size()]);
    }

    public a a(Class class_) {
        return this.b(class_.getName());
    }

    public a b(String string) {
        a a2 = (a)this.s.get(string);
        if (a2 == null) {
            a2 = this.i(string);
            this.s.put(string, a2);
        }
        return a2;
    }

    public void b() {
        this.h("Releasing all known loggers");
        this.s.clear();
    }

    public void c(String string) {
        this.r.remove(string);
    }

    public void a(String string, Object object) {
        if (this.t != null) {
            this.h("setAttribute: call too late; configuration already performed.");
        }
        if (object == null) {
            this.r.remove(string);
        } else {
            this.r.put(string, object);
        }
        if (string.equals("use_tccl")) {
            this.I = object != null && Boolean.valueOf(object.toString()) != false;
        }
    }

    protected static ClassLoader h() {
        return org.apache.commons.d.c.e();
    }

    protected static boolean i() {
        return org.apache.commons.d.c.g();
    }

    protected static ClassLoader d(Class class_) {
        return org.apache.commons.d.c.c(class_);
    }

    private void p() {
        String string;
        Class<?> class_ = this.getClass();
        ClassLoader classLoader = org.apache.commons.d.a.e.d(class_);
        try {
            string = classLoader == null ? "BOOTLOADER" : org.apache.commons.d.c.a((Object)classLoader);
        }
        catch (SecurityException securityException) {
            string = "UNKNOWN";
        }
        this.J = "[LogFactoryImpl@" + System.identityHashCode(this) + " from " + string + "] ";
    }

    protected void h(String string) {
        if (org.apache.commons.d.a.e.i()) {
            org.apache.commons.d.c.e(this.J + string);
        }
    }

    protected String j() {
        if (this.K == null) {
            this.l(this.getClass().getName());
        }
        return this.K;
    }

    protected Constructor k() {
        if (this.t == null) {
            this.l(this.getClass().getName());
        }
        return this.t;
    }

    protected boolean l() {
        return this.b("Jdk13Lumberjack", D);
    }

    protected boolean m() {
        return this.b("Jdk14", C);
    }

    protected boolean n() {
        return this.b("Log4J", B);
    }

    protected a i(String string) {
        try {
            Object[] arrobject;
            a a2;
            if (this.t == null) {
                a2 = this.l(string);
            } else {
                arrobject = new Object[]{string};
                a2 = (a)this.t.newInstance(arrobject);
            }
            if (this.v != null) {
                arrobject = new Object[]{this};
                this.v.invoke(a2, arrobject);
            }
            return a2;
        }
        catch (b b2) {
            throw b2;
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getTargetException();
            throw new b(throwable == null ? invocationTargetException : throwable);
        }
        catch (Throwable throwable) {
            org.apache.commons.d.c.a(throwable);
            throw new b(throwable);
        }
    }

    private static ClassLoader q() {
        return (ClassLoader)AccessController.doPrivileged(new f());
    }

    private static String a(String string, String string2) {
        return (String)AccessController.doPrivileged(new g(string, string2));
    }

    private ClassLoader b(ClassLoader classLoader) {
        try {
            return (ClassLoader)AccessController.doPrivileged(new h(this, classLoader));
        }
        catch (SecurityException securityException) {
            this.h("[SECURITY] Unable to obtain parent classloader");
            return null;
        }
    }

    private boolean b(String string, String string2) {
        if (org.apache.commons.d.a.e.i()) {
            this.h("Checking for '" + string + "'.");
        }
        try {
            a a2 = this.a(string2, this.getClass().getName(), false);
            if (a2 == null) {
                if (org.apache.commons.d.a.e.i()) {
                    this.h("Did not find '" + string + "'.");
                }
                return false;
            }
            if (org.apache.commons.d.a.e.i()) {
                this.h("Found '" + string + "'.");
            }
            return true;
        }
        catch (b b2) {
            if (org.apache.commons.d.a.e.i()) {
                this.h("Logging system '" + string + "' is available but not useable.");
            }
            return false;
        }
    }

    private String k(String string) {
        block10: {
            Object object;
            if (org.apache.commons.d.a.e.i()) {
                this.h("[ENV] Trying to get configuration for item " + string);
            }
            if ((object = this.a(string)) != null) {
                if (org.apache.commons.d.a.e.i()) {
                    this.h("[ENV] Found LogFactory attribute [" + object + "] for " + string);
                }
                return object.toString();
            }
            if (org.apache.commons.d.a.e.i()) {
                this.h("[ENV] No LogFactory attribute found for " + string);
            }
            try {
                String string2 = org.apache.commons.d.a.e.a(string, null);
                if (string2 != null) {
                    if (org.apache.commons.d.a.e.i()) {
                        this.h("[ENV] Found system property [" + string2 + "] for " + string);
                    }
                    return string2;
                }
                if (org.apache.commons.d.a.e.i()) {
                    this.h("[ENV] No system property found for property " + string);
                }
            }
            catch (SecurityException securityException) {
                if (!org.apache.commons.d.a.e.i()) break block10;
                this.h("[ENV] Security prevented reading system property " + string);
            }
        }
        if (org.apache.commons.d.a.e.i()) {
            this.h("[ENV] No configuration defined for item " + string);
        }
        return null;
    }

    private boolean a(String string, boolean bl2) {
        String string2 = this.k(string);
        if (string2 == null) {
            return bl2;
        }
        return Boolean.valueOf(string2);
    }

    private void r() {
        this.L = this.a(o, true);
        this.M = this.a(p, true);
        this.N = this.a(q, true);
    }

    private a l(String string) {
        if (org.apache.commons.d.a.e.i()) {
            this.h("Discovering a Log implementation...");
        }
        this.r();
        a a2 = null;
        String string2 = this.s();
        if (string2 != null) {
            if (org.apache.commons.d.a.e.i()) {
                this.h("Attempting to load user-specified log class '" + string2 + "'...");
            }
            if ((a2 = this.a(string2, string, true)) == null) {
                StringBuffer stringBuffer = new StringBuffer("User-specified log class '");
                stringBuffer.append(string2);
                stringBuffer.append("' cannot be found or is not useable.");
                this.a(stringBuffer, string2, B);
                this.a(stringBuffer, string2, C);
                this.a(stringBuffer, string2, D);
                this.a(stringBuffer, string2, E);
                throw new b(stringBuffer.toString());
            }
            return a2;
        }
        if (org.apache.commons.d.a.e.i()) {
            this.h("No user-specified Log implementation; performing discovery using the standard supported logging implementations...");
        }
        for (int i2 = 0; i2 < H.length && a2 == null; ++i2) {
            a2 = this.a(H[i2], string, true);
        }
        if (a2 == null) {
            throw new b("No suitable Log implementation");
        }
        return a2;
    }

    private void a(StringBuffer stringBuffer, String string, String string2) {
        if (string.equals(string2)) {
            return;
        }
        if (string.regionMatches(true, 0, string2, 0, G + 5)) {
            stringBuffer.append(" Did you mean '");
            stringBuffer.append(string2);
            stringBuffer.append("'?");
        }
    }

    private String s() {
        String string;
        block13: {
            block12: {
                if (org.apache.commons.d.a.e.i()) {
                    this.h("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
                }
                if ((string = (String)this.a(m)) == null) {
                    if (org.apache.commons.d.a.e.i()) {
                        this.h("Trying to get log class from attribute 'org.apache.commons.logging.log'");
                    }
                    string = (String)this.a(n);
                }
                if (string == null) {
                    if (org.apache.commons.d.a.e.i()) {
                        this.h("Trying to get log class from system property 'org.apache.commons.logging.Log'");
                    }
                    try {
                        string = org.apache.commons.d.a.e.a(m, null);
                    }
                    catch (SecurityException securityException) {
                        if (!org.apache.commons.d.a.e.i()) break block12;
                        this.h("No access allowed to system property 'org.apache.commons.logging.Log' - " + securityException.getMessage());
                    }
                }
            }
            if (string == null) {
                if (org.apache.commons.d.a.e.i()) {
                    this.h("Trying to get log class from system property 'org.apache.commons.logging.log'");
                }
                try {
                    string = org.apache.commons.d.a.e.a(n, null);
                }
                catch (SecurityException securityException) {
                    if (!org.apache.commons.d.a.e.i()) break block13;
                    this.h("No access allowed to system property 'org.apache.commons.logging.log' - " + securityException.getMessage());
                }
            }
        }
        if (string != null) {
            string = string.trim();
        }
        return string;
    }

    private a a(String string, String string2, boolean bl2) {
        if (org.apache.commons.d.a.e.i()) {
            this.h("Attempting to instantiate '" + string + "'");
        }
        Object[] arrobject = new Object[]{string2};
        a a2 = null;
        Constructor<?> constructor = null;
        Serializable serializable = null;
        ClassLoader classLoader = this.t();
        while (true) {
            String string3;
            this.h("Trying to load '" + string + "' from classloader " + org.apache.commons.d.c.a((Object)classLoader));
            try {
                Serializable serializable2;
                if (org.apache.commons.d.a.e.i()) {
                    string3 = string.replace('.', '/') + ".class";
                    serializable2 = classLoader != null ? classLoader.getResource(string3) : ClassLoader.getSystemResource(string3 + ".class");
                    if (serializable2 == null) {
                        this.h("Class '" + string + "' [" + string3 + "] cannot be found.");
                    } else {
                        this.h("Class '" + string + "' was found at '" + serializable2 + "'");
                    }
                }
                try {
                    serializable2 = Class.forName(string, true, classLoader);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    String string4 = classNotFoundException.getMessage();
                    this.h("The log adapter '" + string + "' is not available via classloader " + org.apache.commons.d.c.a((Object)classLoader) + ": " + string4.trim());
                    try {
                        serializable2 = Class.forName(string);
                    }
                    catch (ClassNotFoundException classNotFoundException2) {
                        string4 = classNotFoundException2.getMessage();
                        this.h("The log adapter '" + string + "' is not available via the LogFactoryImpl class classloader: " + string4.trim());
                        break;
                    }
                }
                constructor = serializable2.getConstructor(this.u);
                string3 = constructor.newInstance(arrobject);
                if (string3 instanceof a) {
                    serializable = serializable2;
                    a2 = (a)((Object)string3);
                    break;
                }
                this.a(classLoader, (Class)serializable2);
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                string3 = noClassDefFoundError.getMessage();
                this.h("The log adapter '" + string + "' is missing dependencies when loaded via classloader " + org.apache.commons.d.c.a((Object)classLoader) + ": " + string3.trim());
                break;
            }
            catch (ExceptionInInitializerError exceptionInInitializerError) {
                string3 = exceptionInInitializerError.getMessage();
                this.h("The log adapter '" + string + "' is unable to initialize itself when loaded via classloader " + org.apache.commons.d.c.a((Object)classLoader) + ": " + string3.trim());
                break;
            }
            catch (b b2) {
                throw b2;
            }
            catch (Throwable throwable) {
                org.apache.commons.d.c.a(throwable);
                this.a(string, classLoader, throwable);
            }
            if (classLoader == null) break;
            classLoader = this.b(classLoader);
        }
        if (serializable != null && bl2) {
            this.K = string;
            this.t = constructor;
            try {
                this.v = ((Class)serializable).getMethod("setLogFactory", this.w);
                this.h("Found method setLogFactory(LogFactory) in '" + string + "'");
            }
            catch (Throwable throwable) {
                org.apache.commons.d.c.a(throwable);
                this.v = null;
                this.h("[INFO] '" + string + "' from classloader " + org.apache.commons.d.c.a((Object)classLoader) + " does not declare optional method " + "setLogFactory(LogFactory)");
            }
            this.h("Log adapter '" + string + "' from classloader " + org.apache.commons.d.c.a((Object)((Class)serializable).getClassLoader()) + " has been selected for use.");
        }
        return a2;
    }

    private ClassLoader t() {
        ClassLoader classLoader = org.apache.commons.d.a.e.d(z == null ? (z = org.apache.commons.d.a.e.j("org.apache.commons.d.a.e")) : z);
        if (!this.I) {
            return classLoader;
        }
        ClassLoader classLoader2 = org.apache.commons.d.a.e.q();
        ClassLoader classLoader3 = this.a(classLoader2, classLoader);
        if (classLoader3 == null) {
            if (this.L) {
                if (org.apache.commons.d.a.e.i()) {
                    this.h("[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl.");
                }
                return classLoader2;
            }
            throw new b("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
        }
        if (classLoader3 != classLoader2) {
            if (this.L) {
                if (org.apache.commons.d.a.e.i()) {
                    this.h("Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly.");
                }
            } else {
                throw new b("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
        }
        return classLoader3;
    }

    private ClassLoader a(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader == null) {
            return classLoader2;
        }
        if (classLoader2 == null) {
            return classLoader;
        }
        ClassLoader classLoader3 = classLoader;
        while (classLoader3 != null) {
            if (classLoader3 == classLoader2) {
                return classLoader;
            }
            classLoader3 = this.b(classLoader3);
        }
        classLoader3 = classLoader2;
        while (classLoader3 != null) {
            if (classLoader3 == classLoader) {
                return classLoader2;
            }
            classLoader3 = this.b(classLoader3);
        }
        return null;
    }

    private void a(String string, ClassLoader classLoader, Throwable throwable) {
        if (org.apache.commons.d.a.e.i()) {
            InvocationTargetException invocationTargetException;
            Throwable throwable2;
            this.h("Could not instantiate Log '" + string + "' -- " + throwable.getClass().getName() + ": " + throwable.getLocalizedMessage());
            if (throwable instanceof InvocationTargetException && (throwable2 = (invocationTargetException = (InvocationTargetException)throwable).getTargetException()) != null) {
                ExceptionInInitializerError exceptionInInitializerError;
                Throwable throwable3;
                this.h("... InvocationTargetException: " + throwable2.getClass().getName() + ": " + throwable2.getLocalizedMessage());
                if (throwable2 instanceof ExceptionInInitializerError && (throwable3 = (exceptionInInitializerError = (ExceptionInInitializerError)throwable2).getException()) != null) {
                    StringWriter stringWriter = new StringWriter();
                    throwable3.printStackTrace(new PrintWriter(stringWriter, true));
                    this.h("... ExceptionInInitializerError: " + stringWriter.toString());
                }
            }
        }
        if (!this.M) {
            throw new b(throwable);
        }
    }

    private void a(ClassLoader classLoader, Class class_) {
        boolean bl2 = false;
        String string = (A == null ? (A = org.apache.commons.d.a.e.j(m)) : A).getName();
        Class<?>[] arrclass = class_.getInterfaces();
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            if (!string.equals(arrclass[i2].getName())) continue;
            bl2 = true;
            break;
        }
        if (bl2) {
            if (org.apache.commons.d.a.e.i()) {
                try {
                    ClassLoader classLoader2 = org.apache.commons.d.a.e.d(A == null ? (A = org.apache.commons.d.a.e.j(m)) : A);
                    this.h("Class '" + class_.getName() + "' was found in classloader " + org.apache.commons.d.c.a((Object)classLoader) + ". It is bound to a Log interface which is not" + " the one loaded from classloader " + org.apache.commons.d.c.a((Object)classLoader2));
                }
                catch (Throwable throwable) {
                    org.apache.commons.d.c.a(throwable);
                    this.h("Error while trying to output diagnostics about bad class '" + class_ + "'");
                }
            }
            if (!this.N) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Terminating logging for this context ");
                stringBuffer.append("due to bad log hierarchy. ");
                stringBuffer.append("You have more than one version of '");
                stringBuffer.append((A == null ? (A = org.apache.commons.d.a.e.j(m)) : A).getName());
                stringBuffer.append("' visible.");
                if (org.apache.commons.d.a.e.i()) {
                    this.h(stringBuffer.toString());
                }
                throw new b(stringBuffer.toString());
            }
            if (org.apache.commons.d.a.e.i()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Warning: bad log hierarchy. ");
                stringBuffer.append("You have more than one version of '");
                stringBuffer.append((A == null ? (A = org.apache.commons.d.a.e.j(m)) : A).getName());
                stringBuffer.append("' visible.");
                this.h(stringBuffer.toString());
            }
        } else {
            if (!this.M) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Terminating logging for this context. ");
                stringBuffer.append("Log class '");
                stringBuffer.append(class_.getName());
                stringBuffer.append("' does not implement the Log interface.");
                if (org.apache.commons.d.a.e.i()) {
                    this.h(stringBuffer.toString());
                }
                throw new b(stringBuffer.toString());
            }
            if (org.apache.commons.d.a.e.i()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("[WARNING] Log class '");
                stringBuffer.append(class_.getName());
                stringBuffer.append("' does not implement the Log interface.");
                this.h(stringBuffer.toString());
            }
        }
    }

    static Class j(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

    static ClassLoader o() {
        return org.apache.commons.d.c.f();
    }
}

