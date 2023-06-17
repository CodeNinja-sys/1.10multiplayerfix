/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import org.apache.commons.d.a;
import org.apache.commons.d.b;
import org.apache.commons.d.d;
import org.apache.commons.d.e;
import org.apache.commons.d.f;
import org.apache.commons.d.g;
import org.apache.commons.d.h;
import org.apache.commons.d.i;

public abstract class c {
    public static final String a = "priority";
    public static final String b = "use_tccl";
    public static final String c = "org.apache.commons.d.c";
    public static final String d = "org.apache.commons.logging.impl.LogFactoryImpl";
    public static final String e = "commons-logging.properties";
    protected static final String f = "META-INF/services/org.apache.commons.logging.LogFactory";
    public static final String g = "org.apache.commons.logging.diagnostics.dest";
    private static PrintStream m;
    private static final String n;
    public static final String h = "org.apache.commons.logging.LogFactory.HashtableImpl";
    private static final String o = "org.apache.commons.logging.impl.WeakHashtable";
    private static final ClassLoader p;
    protected static Hashtable i;
    protected static volatile c j;
    static Class k;
    static Class l;

    protected c() {
    }

    public abstract Object a(String var1);

    public abstract String[] a();

    public abstract a a(Class var1);

    public abstract a b(String var1);

    public abstract void b();

    public abstract void c(String var1);

    public abstract void a(String var1, Object var2);

    private static final Hashtable h() {
        Hashtable hashtable;
        block7: {
            String string;
            hashtable = null;
            try {
                string = org.apache.commons.d.c.a("org.apache.commons.logging.LogFactory.HashtableImpl", null);
            }
            catch (SecurityException securityException) {
                string = null;
            }
            if (string == null) {
                string = "org.apache.commons.logging.impl.WeakHashtable";
            }
            try {
                Class<?> class_ = Class.forName(string);
                hashtable = (Hashtable)class_.newInstance();
            }
            catch (Throwable throwable) {
                org.apache.commons.d.c.a(throwable);
                if ("org.apache.commons.logging.impl.WeakHashtable".equals(string)) break block7;
                if (org.apache.commons.d.c.g()) {
                    org.apache.commons.d.c.i("[ERROR] LogFactory: Load of custom hashtable failed");
                }
                System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
            }
        }
        if (hashtable == null) {
            hashtable = new Hashtable();
        }
        return hashtable;
    }

    private static String h(String string) {
        if (string == null) {
            return null;
        }
        return string.trim();
    }

    protected static void a(Throwable throwable) {
        if (throwable instanceof ThreadDeath) {
            throw (ThreadDeath)throwable;
        }
        if (throwable instanceof VirtualMachineError) {
            throw (VirtualMachineError)throwable;
        }
    }

    public static c c() {
        String string;
        Object object;
        Enumeration<?> enumeration;
        ClassLoader classLoader;
        Properties properties;
        c c2;
        ClassLoader classLoader2;
        block38: {
            classLoader2 = org.apache.commons.d.c.i();
            if (classLoader2 == null && org.apache.commons.d.c.g()) {
                org.apache.commons.d.c.i("Context classloader is null.");
            }
            if ((c2 = org.apache.commons.d.c.b(classLoader2)) != null) {
                return c2;
            }
            if (org.apache.commons.d.c.g()) {
                org.apache.commons.d.c.i("[LOOKUP] LogFactory implementation requested for the first time for context classloader " + org.apache.commons.d.c.a((Object)classLoader2));
                org.apache.commons.d.c.c("[LOOKUP] ", classLoader2);
            }
            properties = org.apache.commons.d.c.c(classLoader2, "commons-logging.properties");
            classLoader = classLoader2;
            if (properties != null && (enumeration = properties.getProperty("use_tccl")) != null && !Boolean.valueOf((String)((Object)enumeration)).booleanValue()) {
                classLoader = p;
            }
            if (org.apache.commons.d.c.g()) {
                org.apache.commons.d.c.i("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
            }
            try {
                enumeration = org.apache.commons.d.c.a("org.apache.commons.d.c", null);
                if (enumeration != null) {
                    if (org.apache.commons.d.c.g()) {
                        org.apache.commons.d.c.i("[LOOKUP] Creating an instance of LogFactory class '" + (String)((Object)enumeration) + "' as specified by system property " + "org.apache.commons.d.c");
                    }
                    c2 = org.apache.commons.d.c.a((String)((Object)enumeration), classLoader, classLoader2);
                } else if (org.apache.commons.d.c.g()) {
                    org.apache.commons.d.c.i("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
                }
            }
            catch (SecurityException securityException) {
                if (org.apache.commons.d.c.g()) {
                    org.apache.commons.d.c.i("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [" + org.apache.commons.d.c.h(securityException.getMessage()) + "]. Trying alternative implementations...");
                }
            }
            catch (RuntimeException runtimeException) {
                if (org.apache.commons.d.c.g()) {
                    org.apache.commons.d.c.i("[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: [" + org.apache.commons.d.c.h(runtimeException.getMessage()) + "] as specified by a system property.");
                }
                throw runtimeException;
            }
            if (c2 == null) {
                if (org.apache.commons.d.c.g()) {
                    org.apache.commons.d.c.i("[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
                }
                try {
                    enumeration = org.apache.commons.d.c.a(classLoader2, "META-INF/services/org.apache.commons.logging.LogFactory");
                    if (enumeration != null) {
                        try {
                            object = new BufferedReader(new InputStreamReader((InputStream)((Object)enumeration), "UTF-8"));
                        }
                        catch (UnsupportedEncodingException unsupportedEncodingException) {
                            object = new BufferedReader(new InputStreamReader((InputStream)((Object)enumeration)));
                        }
                        string = ((BufferedReader)object).readLine();
                        ((BufferedReader)object).close();
                        if (string != null && !"".equals(string)) {
                            if (org.apache.commons.d.c.g()) {
                                org.apache.commons.d.c.i("[LOOKUP]  Creating an instance of LogFactory class " + string + " as specified by file '" + "META-INF/services/org.apache.commons.logging.LogFactory" + "' which was present in the path of the context classloader.");
                            }
                            c2 = org.apache.commons.d.c.a(string, classLoader, classLoader2);
                        }
                        break block38;
                    }
                    if (org.apache.commons.d.c.g()) {
                        org.apache.commons.d.c.i("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
                    }
                }
                catch (Exception exception) {
                    if (!org.apache.commons.d.c.g()) break block38;
                    org.apache.commons.d.c.i("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [" + org.apache.commons.d.c.h(exception.getMessage()) + "]. Trying alternative implementations...");
                }
            }
        }
        if (c2 == null) {
            if (properties != null) {
                if (org.apache.commons.d.c.g()) {
                    org.apache.commons.d.c.i("[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use...");
                }
                if ((enumeration = properties.getProperty("org.apache.commons.d.c")) != null) {
                    if (org.apache.commons.d.c.g()) {
                        org.apache.commons.d.c.i("[LOOKUP] Properties file specifies LogFactory subclass '" + enumeration + "'");
                    }
                    c2 = org.apache.commons.d.c.a(enumeration, classLoader, classLoader2);
                } else if (org.apache.commons.d.c.g()) {
                    org.apache.commons.d.c.i("[LOOKUP] Properties file has no entry specifying LogFactory subclass.");
                }
            } else if (org.apache.commons.d.c.g()) {
                org.apache.commons.d.c.i("[LOOKUP] No properties file available to determine LogFactory subclass from..");
            }
        }
        if (c2 == null) {
            if (org.apache.commons.d.c.g()) {
                org.apache.commons.d.c.i("[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader).");
            }
            c2 = org.apache.commons.d.c.a("org.apache.commons.logging.impl.LogFactoryImpl", p, classLoader2);
        }
        if (c2 != null) {
            org.apache.commons.d.c.a(classLoader2, c2);
            if (properties != null) {
                enumeration = properties.propertyNames();
                while (enumeration.hasMoreElements()) {
                    object = (String)enumeration.nextElement();
                    string = properties.getProperty((String)object);
                    c2.a((String)object, string);
                }
            }
        }
        return c2;
    }

    public static a b(Class class_) {
        return org.apache.commons.d.c.c().a(class_);
    }

    public static a d(String string) {
        return org.apache.commons.d.c.c().b(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(ClassLoader classLoader) {
        Hashtable hashtable;
        if (org.apache.commons.d.c.g()) {
            org.apache.commons.d.c.i("Releasing factory for classloader " + org.apache.commons.d.c.a((Object)classLoader));
        }
        Hashtable hashtable2 = hashtable = i;
        synchronized (hashtable2) {
            if (classLoader == null) {
                if (j != null) {
                    j.b();
                    j = null;
                }
            } else {
                c c2 = (c)hashtable.get(classLoader);
                if (c2 != null) {
                    c2.b();
                    hashtable.remove(classLoader);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void d() {
        Hashtable hashtable;
        if (org.apache.commons.d.c.g()) {
            org.apache.commons.d.c.i("Releasing factory for all classloaders.");
        }
        Hashtable hashtable2 = hashtable = i;
        synchronized (hashtable2) {
            Enumeration enumeration = hashtable.elements();
            while (enumeration.hasMoreElements()) {
                c c2 = (c)enumeration.nextElement();
                c2.b();
            }
            hashtable.clear();
            if (j != null) {
                j.b();
                j = null;
            }
        }
    }

    protected static ClassLoader c(Class class_) {
        try {
            return class_.getClassLoader();
        }
        catch (SecurityException securityException) {
            if (org.apache.commons.d.c.g()) {
                org.apache.commons.d.c.i("Unable to get classloader for class '" + class_ + "' due to security restrictions - " + securityException.getMessage());
            }
            throw securityException;
        }
    }

    protected static ClassLoader e() {
        return org.apache.commons.d.c.f();
    }

    private static ClassLoader i() {
        return (ClassLoader)AccessController.doPrivileged(new d());
    }

    protected static ClassLoader f() {
        ClassLoader classLoader = null;
        try {
            Method method = (k == null ? (k = org.apache.commons.d.c.f("java.lang.Thread")) : k).getMethod("getContextClassLoader", null);
            try {
                classLoader = (ClassLoader)method.invoke(Thread.currentThread(), null);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new b("Unexpected IllegalAccessException", illegalAccessException);
            }
            catch (InvocationTargetException invocationTargetException) {
                if (!(invocationTargetException.getTargetException() instanceof SecurityException)) {
                    throw new b("Unexpected InvocationTargetException", invocationTargetException.getTargetException());
                }
            }
        }
        catch (NoSuchMethodException noSuchMethodException) {
            classLoader = org.apache.commons.d.c.c(l == null ? (l = org.apache.commons.d.c.f("org.apache.commons.d.c")) : l);
        }
        return classLoader;
    }

    private static c b(ClassLoader classLoader) {
        if (classLoader == null) {
            return j;
        }
        return (c)i.get(classLoader);
    }

    private static void a(ClassLoader classLoader, c c2) {
        if (c2 != null) {
            if (classLoader == null) {
                j = c2;
            } else {
                i.put(classLoader, c2);
            }
        }
    }

    protected static c a(String string, ClassLoader classLoader, ClassLoader classLoader2) {
        Object t2 = AccessController.doPrivileged(new e(string, classLoader));
        if (t2 instanceof b) {
            b b2 = (b)t2;
            if (org.apache.commons.d.c.g()) {
                org.apache.commons.d.c.i("An error occurred while loading the factory class:" + b2.getMessage());
            }
            throw b2;
        }
        if (org.apache.commons.d.c.g()) {
            org.apache.commons.d.c.i("Created object " + org.apache.commons.d.c.a(t2) + " to manage classloader " + org.apache.commons.d.c.a((Object)classLoader2));
        }
        return (c)t2;
    }

    protected static c a(String string, ClassLoader classLoader) {
        return org.apache.commons.d.c.a(string, classLoader, null);
    }

    protected static Object b(String string, ClassLoader classLoader) {
        Class<?> class_ = null;
        try {
            block21: {
                if (classLoader != null) {
                    try {
                        class_ = classLoader.loadClass(string);
                        if ((l == null ? (l = org.apache.commons.d.c.f("org.apache.commons.d.c")) : l).isAssignableFrom(class_)) {
                            if (org.apache.commons.d.c.g()) {
                                org.apache.commons.d.c.i("Loaded class " + class_.getName() + " from classloader " + org.apache.commons.d.c.a((Object)classLoader));
                            }
                        } else if (org.apache.commons.d.c.g()) {
                            org.apache.commons.d.c.i("Factory class " + class_.getName() + " loaded from classloader " + org.apache.commons.d.c.a((Object)class_.getClassLoader()) + " does not extend '" + (l == null ? (l = org.apache.commons.d.c.f("org.apache.commons.d.c")) : l).getName() + "' as loaded by this classloader.");
                            org.apache.commons.d.c.c("[BAD CL TREE] ", classLoader);
                        }
                        return (c)class_.newInstance();
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        if (classLoader == p) {
                            if (org.apache.commons.d.c.g()) {
                                org.apache.commons.d.c.i("Unable to locate any class called '" + string + "' via classloader " + org.apache.commons.d.c.a((Object)classLoader));
                            }
                            throw classNotFoundException;
                        }
                    }
                    catch (NoClassDefFoundError noClassDefFoundError) {
                        if (classLoader == p) {
                            if (org.apache.commons.d.c.g()) {
                                org.apache.commons.d.c.i("Class '" + string + "' cannot be loaded" + " via classloader " + org.apache.commons.d.c.a((Object)classLoader) + " - it depends on some other class that cannot be found.");
                            }
                            throw noClassDefFoundError;
                        }
                    }
                    catch (ClassCastException classCastException) {
                        if (classLoader != p) break block21;
                        boolean bl2 = org.apache.commons.d.c.d(class_);
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("The application has specified that a custom LogFactory implementation ");
                        stringBuffer.append("should be used but Class '");
                        stringBuffer.append(string);
                        stringBuffer.append("' cannot be converted to '");
                        stringBuffer.append((l == null ? (l = org.apache.commons.d.c.f("org.apache.commons.d.c")) : l).getName());
                        stringBuffer.append("'. ");
                        if (bl2) {
                            stringBuffer.append("The conflict is caused by the presence of multiple LogFactory classes ");
                            stringBuffer.append("in incompatible classloaders. ");
                            stringBuffer.append("Background can be found in http://commons.apache.org/logging/tech.html. ");
                            stringBuffer.append("If you have not explicitly specified a custom LogFactory then it is likely ");
                            stringBuffer.append("that the container has set one without your knowledge. ");
                            stringBuffer.append("In this case, consider using the commons-logging-adapters.jar file or ");
                            stringBuffer.append("specifying the standard LogFactory from the command line. ");
                        } else {
                            stringBuffer.append("Please check the custom implementation. ");
                        }
                        stringBuffer.append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.");
                        if (org.apache.commons.d.c.g()) {
                            org.apache.commons.d.c.i(stringBuffer.toString());
                        }
                        throw new ClassCastException(stringBuffer.toString());
                    }
                }
            }
            if (org.apache.commons.d.c.g()) {
                org.apache.commons.d.c.i("Unable to load factory class via classloader " + org.apache.commons.d.c.a((Object)classLoader) + " - trying the classloader associated with this LogFactory.");
            }
            class_ = Class.forName(string);
            return (c)class_.newInstance();
        }
        catch (Exception exception) {
            if (org.apache.commons.d.c.g()) {
                org.apache.commons.d.c.i("Unable to create LogFactory instance.");
            }
            if (class_ != null && !(l == null ? (l = org.apache.commons.d.c.f("org.apache.commons.d.c")) : l).isAssignableFrom(class_)) {
                return new b("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", exception);
            }
            return new b(exception);
        }
    }

    private static boolean d(Class class_) {
        boolean bl2 = false;
        if (class_ != null) {
            try {
                ClassLoader classLoader = class_.getClassLoader();
                if (classLoader == null) {
                    org.apache.commons.d.c.i("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                } else {
                    org.apache.commons.d.c.c("[CUSTOM LOG FACTORY] ", classLoader);
                    Class<?> class_2 = Class.forName("org.apache.commons.d.c", false, classLoader);
                    bl2 = class_2.isAssignableFrom(class_);
                    if (bl2) {
                        org.apache.commons.d.c.i("[CUSTOM LOG FACTORY] " + class_.getName() + " implements LogFactory but was loaded by an incompatible classloader.");
                    } else {
                        org.apache.commons.d.c.i("[CUSTOM LOG FACTORY] " + class_.getName() + " does not implement LogFactory.");
                    }
                }
            }
            catch (SecurityException securityException) {
                org.apache.commons.d.c.i("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: " + securityException.getMessage());
            }
            catch (LinkageError linkageError) {
                org.apache.commons.d.c.i("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: " + linkageError.getMessage());
            }
            catch (ClassNotFoundException classNotFoundException) {
                org.apache.commons.d.c.i("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            }
        }
        return bl2;
    }

    private static InputStream a(ClassLoader classLoader, String string) {
        return (InputStream)AccessController.doPrivileged(new f(classLoader, string));
    }

    private static Enumeration b(ClassLoader classLoader, String string) {
        g g2 = new g(classLoader, string);
        Object t2 = AccessController.doPrivileged(g2);
        return (Enumeration)t2;
    }

    private static Properties a(URL uRL) {
        h h2 = new h(uRL);
        return (Properties)AccessController.doPrivileged(h2);
    }

    private static final Properties c(ClassLoader classLoader, String string) {
        URL uRL;
        Properties properties;
        block12: {
            properties = null;
            double d2 = 0.0;
            uRL = null;
            try {
                Enumeration enumeration = org.apache.commons.d.c.b(classLoader, string);
                if (enumeration == null) {
                    return null;
                }
                while (enumeration.hasMoreElements()) {
                    String string2;
                    URL uRL2 = (URL)enumeration.nextElement();
                    Properties properties2 = org.apache.commons.d.c.a(uRL2);
                    if (properties2 == null) continue;
                    if (properties == null) {
                        uRL = uRL2;
                        properties = properties2;
                        string2 = properties.getProperty("priority");
                        d2 = 0.0;
                        if (string2 != null) {
                            d2 = Double.parseDouble(string2);
                        }
                        if (!org.apache.commons.d.c.g()) continue;
                        org.apache.commons.d.c.i("[LOOKUP] Properties file found at '" + uRL2 + "'" + " with priority " + d2);
                        continue;
                    }
                    string2 = properties2.getProperty("priority");
                    double d3 = 0.0;
                    if (string2 != null) {
                        d3 = Double.parseDouble(string2);
                    }
                    if (d3 > d2) {
                        if (org.apache.commons.d.c.g()) {
                            org.apache.commons.d.c.i("[LOOKUP] Properties file at '" + uRL2 + "'" + " with priority " + d3 + " overrides file at '" + uRL + "'" + " with priority " + d2);
                        }
                        uRL = uRL2;
                        properties = properties2;
                        d2 = d3;
                        continue;
                    }
                    if (!org.apache.commons.d.c.g()) continue;
                    org.apache.commons.d.c.i("[LOOKUP] Properties file at '" + uRL2 + "'" + " with priority " + d3 + " does not override file at '" + uRL + "'" + " with priority " + d2);
                }
            }
            catch (SecurityException securityException) {
                if (!org.apache.commons.d.c.g()) break block12;
                org.apache.commons.d.c.i("SecurityException thrown while trying to find/read config files.");
            }
        }
        if (org.apache.commons.d.c.g()) {
            if (properties == null) {
                org.apache.commons.d.c.i("[LOOKUP] No properties file of name '" + string + "' found.");
            } else {
                org.apache.commons.d.c.i("[LOOKUP] Properties file of name '" + string + "' found at '" + uRL + '\"');
            }
        }
        return properties;
    }

    private static String a(String string, String string2) {
        return (String)AccessController.doPrivileged(new i(string, string2));
    }

    private static PrintStream j() {
        String string;
        try {
            string = org.apache.commons.d.c.a("org.apache.commons.logging.diagnostics.dest", null);
            if (string == null) {
                return null;
            }
        }
        catch (SecurityException securityException) {
            return null;
        }
        if (string.equals("STDOUT")) {
            return System.out;
        }
        if (string.equals("STDERR")) {
            return System.err;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(string, true);
            return new PrintStream(fileOutputStream);
        }
        catch (IOException iOException) {
            return null;
        }
    }

    protected static boolean g() {
        return m != null;
    }

    private static final void i(String string) {
        if (m != null) {
            m.print(n);
            m.println(string);
            m.flush();
        }
    }

    protected static final void e(String string) {
        if (m != null) {
            m.println(string);
            m.flush();
        }
    }

    private static void e(Class class_) {
        ClassLoader classLoader;
        if (!org.apache.commons.d.c.g()) {
            return;
        }
        try {
            org.apache.commons.d.c.i("[ENV] Extension directories (java.ext.dir): " + System.getProperty("java.ext.dir"));
            org.apache.commons.d.c.i("[ENV] Application classpath (java.class.path): " + System.getProperty("java.class.path"));
        }
        catch (SecurityException securityException) {
            org.apache.commons.d.c.i("[ENV] Security setting prevent interrogation of system classpaths.");
        }
        String string = class_.getName();
        try {
            classLoader = org.apache.commons.d.c.c(class_);
        }
        catch (SecurityException securityException) {
            org.apache.commons.d.c.i("[ENV] Security forbids determining the classloader for " + string);
            return;
        }
        org.apache.commons.d.c.i("[ENV] Class " + string + " was loaded via classloader " + org.apache.commons.d.c.a((Object)classLoader));
        org.apache.commons.d.c.c("[ENV] Ancestry of classloader which loaded " + string + " is ", classLoader);
    }

    private static void c(String string, ClassLoader classLoader) {
        ClassLoader classLoader2;
        CharSequence charSequence;
        if (!org.apache.commons.d.c.g()) {
            return;
        }
        if (classLoader != null) {
            charSequence = classLoader.toString();
            org.apache.commons.d.c.i(string + org.apache.commons.d.c.a((Object)classLoader) + " == '" + (String)charSequence + "'");
        }
        try {
            classLoader2 = ClassLoader.getSystemClassLoader();
        }
        catch (SecurityException securityException) {
            org.apache.commons.d.c.i(string + "Security forbids determining the system classloader.");
            return;
        }
        if (classLoader != null) {
            block9: {
                charSequence = new StringBuffer(string + "ClassLoader tree:");
                do {
                    ((StringBuffer)charSequence).append(org.apache.commons.d.c.a((Object)classLoader));
                    if (classLoader == classLoader2) {
                        ((StringBuffer)charSequence).append(" (SYSTEM) ");
                    }
                    try {
                        classLoader = classLoader.getParent();
                    }
                    catch (SecurityException securityException) {
                        ((StringBuffer)charSequence).append(" --> SECRET");
                        break block9;
                    }
                    ((StringBuffer)charSequence).append(" --> ");
                } while (classLoader != null);
                ((StringBuffer)charSequence).append("BOOT");
            }
            org.apache.commons.d.c.i(((StringBuffer)charSequence).toString());
        }
    }

    public static String a(Object object) {
        if (object == null) {
            return "null";
        }
        return object.getClass().getName() + "@" + System.identityHashCode(object);
    }

    static Class f(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

    static void g(String string) {
        org.apache.commons.d.c.i(string);
    }

    static {
        String string;
        m = null;
        i = null;
        j = null;
        p = org.apache.commons.d.c.c(l == null ? (l = org.apache.commons.d.c.f("org.apache.commons.d.c")) : l);
        try {
            ClassLoader classLoader = p;
            string = p == null ? "BOOTLOADER" : org.apache.commons.d.c.a((Object)classLoader);
        }
        catch (SecurityException securityException) {
            string = "UNKNOWN";
        }
        n = "[LogFactory from " + string + "] ";
        m = org.apache.commons.d.c.j();
        org.apache.commons.d.c.e(l == null ? (l = org.apache.commons.d.c.f("org.apache.commons.d.c")) : l);
        i = org.apache.commons.d.c.h();
        if (org.apache.commons.d.c.g()) {
            org.apache.commons.d.c.i("BOOTSTRAP COMPLETED");
        }
    }
}

