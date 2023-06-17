/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.a.a;
import io.netty.util.c.ae;
import io.netty.util.c.g;
import io.netty.util.c.h;
import io.netty.util.c.v;
import io.netty.util.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class u {
    private static final io.netty.util.c.b.g a = io.netty.util.c.b.h.a(u.class);
    private static final Pattern b = Pattern.compile("\\s*-XX:MaxDirectMemorySize\\s*=\\s*([0-9]+)\\s*([kKmMgG]?)\\s*$");
    private static final boolean c = u.q();
    private static final boolean d = u.r();
    private static final boolean e = u.s();
    private static final int f = u.t();
    private static final boolean g = !u.a();
    private static final boolean h = u.u();
    private static final boolean i = h && f < 8;
    private static final boolean j = h && !ae.a("io.netty.noPreferDirect", false);
    private static final long k = u.w();
    private static final long l = u.v();
    private static final boolean m = u.x();
    private static final File n = u.y();
    private static final int o = u.z();
    private static final int p = u.A();

    public static boolean a() {
        return c;
    }

    public static boolean b() {
        return d;
    }

    public static boolean c() {
        return e;
    }

    public static int d() {
        return f;
    }

    public static boolean e() {
        return g;
    }

    public static boolean f() {
        return h;
    }

    public static boolean g() {
        return j;
    }

    public static long h() {
        return k;
    }

    public static boolean i() {
        return m;
    }

    public static File j() {
        return n;
    }

    public static int k() {
        return o;
    }

    public static int l() {
        return p;
    }

    public static long a(long l2) {
        return v.e(l2);
    }

    public static void b(long l2) {
        v.f(l2);
    }

    public static void a(Throwable throwable) {
        if (u.f()) {
            v.a(throwable);
        } else {
            u.b(throwable);
        }
    }

    private static void b(Throwable throwable) {
        throw throwable;
    }

    public static ConcurrentMap m() {
        if (i) {
            return new a();
        }
        return new ConcurrentHashMap();
    }

    public static ConcurrentMap a(int n2) {
        if (i) {
            return new a(n2);
        }
        return new ConcurrentHashMap(n2);
    }

    public static ConcurrentMap a(int n2, float f2) {
        if (i) {
            return new a(n2, f2);
        }
        return new ConcurrentHashMap(n2, f2);
    }

    public static ConcurrentMap a(int n2, float f2, int n3) {
        if (i) {
            return new a(n2, f2, n3);
        }
        return new ConcurrentHashMap(n2, f2, n3);
    }

    public static ConcurrentMap a(Map map) {
        if (i) {
            return new a(map);
        }
        return new ConcurrentHashMap(map);
    }

    public static void a(ByteBuffer byteBuffer) {
        if (u.f() && !u.a()) {
            v.a(byteBuffer);
        }
    }

    public static long b(ByteBuffer byteBuffer) {
        return v.b(byteBuffer);
    }

    public static Object a(Object object, long l2) {
        return v.a(object, l2);
    }

    public static Object b(Object object, long l2) {
        return v.b(object, l2);
    }

    public static int c(Object object, long l2) {
        return v.c(object, l2);
    }

    public static long a(Field field) {
        return v.a(field);
    }

    public static byte c(long l2) {
        return v.a(l2);
    }

    public static short d(long l2) {
        return v.b(l2);
    }

    public static int e(long l2) {
        return v.c(l2);
    }

    public static long f(long l2) {
        return v.d(l2);
    }

    public static void a(Object object, long l2, Object object2) {
        v.a(object, l2, object2);
    }

    public static void a(long l2, byte by2) {
        v.a(l2, by2);
    }

    public static void a(long l2, short s2) {
        v.a(l2, s2);
    }

    public static void a(long l2, int n2) {
        v.a(l2, n2);
    }

    public static void a(long l2, long l3) {
        v.a(l2, l3);
    }

    public static void a(long l2, long l3, long l4) {
        v.a(l2, l3, l4);
    }

    public static void a(byte[] arrby, int n2, long l2, long l3) {
        v.a(arrby, l + (long)n2, null, l2, l3);
    }

    public static void a(long l2, byte[] arrby, int n2, long l3) {
        v.a(null, l2, arrby, l + (long)n2, l3);
    }

    public static AtomicReferenceFieldUpdater a(Class class_, String string) {
        if (u.f()) {
            try {
                return v.a(class_, string);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return null;
    }

    public static AtomicIntegerFieldUpdater b(Class class_, String string) {
        if (u.f()) {
            try {
                return v.b(class_, string);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return null;
    }

    public static AtomicLongFieldUpdater c(Class class_, String string) {
        if (u.f()) {
            try {
                return v.c(class_, string);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return null;
    }

    public static Queue n() {
        return new h();
    }

    public static ClassLoader a(Class class_) {
        return v.a(class_);
    }

    public static ClassLoader o() {
        return v.c();
    }

    public static ClassLoader p() {
        return v.d();
    }

    private static boolean q() {
        boolean bl2;
        try {
            Class.forName("android.app.Application", false, u.p());
            bl2 = true;
        }
        catch (Exception exception) {
            bl2 = false;
        }
        if (bl2) {
            a.b("Platform: Android");
        }
        return bl2;
    }

    private static boolean r() {
        boolean bl2 = ae.a("os.name", "").toLowerCase(Locale.US).contains("win");
        if (bl2) {
            a.b("Platform: Windows");
        }
        return bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean s() {
        Object object;
        if (u.b()) {
            return false;
        }
        String[] arrstring = new String[]{"/usr/bin/id", "/bin/id", "id", "/usr/xpg4/bin/id"};
        Pattern pattern = Pattern.compile("^(?:0|[1-9][0-9]*)$");
        for (String string : arrstring) {
            object = null;
            BufferedReader bufferedReader = null;
            String string2 = null;
            try {
                object = Runtime.getRuntime().exec(new String[]{string, "-u"});
                bufferedReader = new BufferedReader(new InputStreamReader(((Process)object).getInputStream(), io.netty.util.e.f));
                string2 = bufferedReader.readLine();
                bufferedReader.close();
                while (true) {
                    try {
                        int n2 = ((Process)object).waitFor();
                        if (n2 != 0) {
                            string2 = null;
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        continue;
                    }
                    break;
                }
            }
            catch (Exception exception) {
                string2 = null;
            }
            finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    }
                    catch (IOException iOException) {}
                }
                if (object != null) {
                    try {
                        ((Process)object).destroy();
                    }
                    catch (Exception exception) {}
                }
            }
            if (string2 == null || !pattern.matcher(string2).matches()) continue;
            a.b("UID: {}", (Object)string2);
            return "0".equals(string2);
        }
        a.b("Could not determine the current UID using /usr/bin/id; attempting to bind at privileged ports.");
        Pattern pattern2 = Pattern.compile(".*(?:denied|not.*permitted).*");
        for (int i2 = 1023; i2 > 0; --i2) {
            ServerSocket serverSocket = null;
            try {
                serverSocket = new ServerSocket();
                serverSocket.setReuseAddress(true);
                serverSocket.bind(new InetSocketAddress(i2));
                if (a.d()) {
                    a.b("UID: 0 (succeded to bind at port {})", (Object)i2);
                }
                boolean bl2 = true;
                return bl2;
            }
            catch (Exception exception) {
                object = exception.getMessage();
                if (object == null) {
                    object = "";
                }
                if (!pattern2.matcher((CharSequence)(object = ((String)object).toLowerCase())).matches()) continue;
                break;
            }
            finally {
                if (serverSocket != null) {
                    try {
                        serverSocket.close();
                    }
                    catch (Exception exception) {}
                }
            }
        }
        a.b("UID: non-root (failed to bind at any privileged ports)");
        return false;
    }

    private static int t() {
        int n2;
        if (u.a()) {
            n2 = 6;
        } else {
            try {
                Class.forName("java.time.Clock", false, u.a(Object.class));
                n2 = 8;
            }
            catch (Exception exception) {
                try {
                    Class.forName("java.util.concurrent.LinkedTransferQueue", false, u.a(BlockingQueue.class));
                    n2 = 7;
                }
                catch (Exception exception2) {
                    n2 = 6;
                }
            }
        }
        if (a.d()) {
            a.b("Java version: {}", (Object)n2);
        }
        return n2;
    }

    private static boolean u() {
        boolean bl2 = ae.a("io.netty.noUnsafe", false);
        a.b("-Dio.netty.noUnsafe: {}", (Object)bl2);
        if (u.a()) {
            a.b("sun.misc.Unsafe: unavailable (Android)");
            return false;
        }
        if (bl2) {
            a.b("sun.misc.Unsafe: unavailable (io.netty.noUnsafe)");
            return false;
        }
        boolean bl3 = ae.a("io.netty.tryUnsafe") ? ae.a("io.netty.tryUnsafe", true) : ae.a("org.jboss.netty.tryUnsafe", true);
        if (!bl3) {
            a.b("sun.misc.Unsafe: unavailable (io.netty.tryUnsafe/org.jboss.netty.tryUnsafe)");
            return false;
        }
        try {
            boolean bl4 = v.a();
            a.b("sun.misc.Unsafe: {}", (Object)(bl4 ? "available" : "unavailable"));
            return bl4;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    private static long v() {
        if (!u.f()) {
            return -1L;
        }
        return v.b();
    }

    private static long w() {
        GenericDeclaration genericDeclaration;
        Class<?> class_;
        long l2 = 0L;
        try {
            class_ = Class.forName("sun.misc.VM", true, u.p());
            genericDeclaration = class_.getDeclaredMethod("maxDirectMemory", new Class[0]);
            l2 = ((Number)((Method)genericDeclaration).invoke(null, new Object[0])).longValue();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (l2 > 0L) {
            return l2;
        }
        try {
            class_ = Class.forName("java.lang.management.ManagementFactory", true, u.p());
            genericDeclaration = Class.forName("java.lang.management.RuntimeMXBean", true, u.p());
            Object object = class_.getDeclaredMethod("getRuntimeMXBean", new Class[0]).invoke(null, new Object[0]);
            List list = (List)((Class)genericDeclaration).getDeclaredMethod("getInputArguments", new Class[0]).invoke(object, new Object[0]);
            for (int i2 = list.size() - 1; i2 >= 0; --i2) {
                Matcher matcher = b.matcher((CharSequence)list.get(i2));
                if (!matcher.matches()) continue;
                l2 = Long.parseLong(matcher.group(1));
                switch (matcher.group(2).charAt(0)) {
                    case 'K': 
                    case 'k': {
                        l2 *= 1024L;
                        break;
                    }
                    case 'M': 
                    case 'm': {
                        l2 *= 0x100000L;
                        break;
                    }
                    case 'G': 
                    case 'g': {
                        l2 *= 0x40000000L;
                    }
                }
                break;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (l2 <= 0L) {
            l2 = Runtime.getRuntime().maxMemory();
            a.b("maxDirectMemory: {} bytes (maybe)", (Object)l2);
        } else {
            a.b("maxDirectMemory: {} bytes", (Object)l2);
        }
        return l2;
    }

    private static boolean x() {
        if (u.a()) {
            return false;
        }
        boolean bl2 = ae.a("io.netty.noJavassist", false);
        a.b("-Dio.netty.noJavassist: {}", (Object)bl2);
        if (bl2) {
            a.b("Javassist: unavailable (io.netty.noJavassist)");
            return false;
        }
        try {
            io.netty.util.c.g.a(Object.class, u.a(u.class));
            a.b("Javassist: available");
            return true;
        }
        catch (Throwable throwable) {
            a.b("Javassist: unavailable");
            a.b("You don't have Javassist in your class path or you don't have enough permission to load dynamically generated classes.  Please check the configuration for better performance.");
            return false;
        }
    }

    private static File y() {
        File file;
        try {
            file = u.a(ae.b("io.netty.tmpdir"));
            if (file != null) {
                a.b("-Dio.netty.tmpdir: {}", (Object)file);
                return file;
            }
            file = u.a(ae.b("java.io.tmpdir"));
            if (file != null) {
                a.b("-Dio.netty.tmpdir: {} (java.io.tmpdir)", (Object)file);
                return file;
            }
            if (u.b()) {
                file = u.a(System.getenv("TEMP"));
                if (file != null) {
                    a.b("-Dio.netty.tmpdir: {} (%TEMP%)", (Object)file);
                    return file;
                }
                String string = System.getenv("USERPROFILE");
                if (string != null) {
                    file = u.a(string + "\\AppData\\Local\\Temp");
                    if (file != null) {
                        a.b("-Dio.netty.tmpdir: {} (%USERPROFILE%\\AppData\\Local\\Temp)", (Object)file);
                        return file;
                    }
                    file = u.a(string + "\\Local Settings\\Temp");
                    if (file != null) {
                        a.b("-Dio.netty.tmpdir: {} (%USERPROFILE%\\Local Settings\\Temp)", (Object)file);
                        return file;
                    }
                }
            } else {
                file = u.a(System.getenv("TMPDIR"));
                if (file != null) {
                    a.b("-Dio.netty.tmpdir: {} ($TMPDIR)", (Object)file);
                    return file;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        file = u.b() ? new File("C:\\Windows\\Temp") : new File("/tmp");
        a.d("Failed to get the temporary directory; falling back to: {}", (Object)file);
        return file;
    }

    private static File a(String string) {
        if (string == null) {
            return null;
        }
        File file = new File(string);
        file.mkdirs();
        if (!file.isDirectory()) {
            return null;
        }
        try {
            return file.getAbsoluteFile();
        }
        catch (Exception exception) {
            return file;
        }
    }

    private static int z() {
        int n2 = ae.a("io.netty.bitMode", 0);
        if (n2 > 0) {
            a.b("-Dio.netty.bitMode: {}", (Object)n2);
            return n2;
        }
        n2 = ae.a("sun.arch.data.model", 0);
        if (n2 > 0) {
            a.b("-Dio.netty.bitMode: {} (sun.arch.data.model)", (Object)n2);
            return n2;
        }
        n2 = ae.a("com.ibm.vm.bitmode", 0);
        if (n2 > 0) {
            a.b("-Dio.netty.bitMode: {} (com.ibm.vm.bitmode)", (Object)n2);
            return n2;
        }
        String string = ae.a("os.arch", "").toLowerCase(Locale.US).trim();
        if ("amd64".equals(string) || "x86_64".equals(string)) {
            n2 = 64;
        } else if ("i386".equals(string) || "i486".equals(string) || "i586".equals(string) || "i686".equals(string)) {
            n2 = 32;
        }
        if (n2 > 0) {
            a.b("-Dio.netty.bitMode: {} (os.arch: {})", (Object)n2, (Object)string);
        }
        String string2 = ae.a("java.vm.name", "").toLowerCase(Locale.US);
        Pattern pattern = Pattern.compile("([1-9][0-9]+)-?bit");
        Matcher matcher = pattern.matcher(string2);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 64;
    }

    private static int A() {
        if (!u.f()) {
            return -1;
        }
        return v.e();
    }

    private u() {
    }

    static {
        if (a.d()) {
            a.b("-Dio.netty.noPreferDirect: {}", (Object)(!j ? 1 : 0));
        }
        if (!u.f() && !u.a()) {
            a.c("Your platform does not provide complete low-level API for accessing direct buffers reliably. Unless explicitly requested, heap buffer will always be preferred to avoid potential system unstability.");
        }
    }
}

