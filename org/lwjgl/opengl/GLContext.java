/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import org.lwjgl.ab;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.fu;
import org.lwjgl.opengl.fv;
import org.lwjgl.opengl.fw;
import org.lwjgl.opengl.ig;
import org.lwjgl.opengl.iy;

public final class GLContext {
    private static final ThreadLocal a = new ThreadLocal();
    private static fw b = new fw(null);
    private static final ThreadLocal c = new ThreadLocal();
    private static final Map d = new WeakHashMap();
    private static int e;
    private static boolean f;

    public static dt a() {
        dt dt2 = GLContext.d();
        if (dt2 == null) {
            throw new RuntimeException("No OpenGL context found in the current thread.");
        }
        return dt2;
    }

    private static dt d() {
        fw fw2 = b;
        if (fw2.a == Thread.currentThread()) {
            return fw2.b;
        }
        return GLContext.e();
    }

    static dt a(Object object) {
        return (dt)d.get(object);
    }

    private static dt e() {
        return (dt)a.get();
    }

    static void a(dt dt2) {
        a.set(dt2);
        fw fw2 = (fw)c.get();
        if (fw2 == null) {
            fw2 = new fw(null);
            c.set(fw2);
        }
        fw2.a = Thread.currentThread();
        fw2.b = dt2;
        b = fw2;
    }

    static long a(String string, String[] arrstring, String[] arrstring2, String string2) {
        String string3 = (String)AccessController.doPrivileged(new fu());
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!string3.startsWith(arrstring[i2])) continue;
            String string4 = string2.replaceFirst(string, arrstring2[i2]);
            long l2 = GLContext.a(string4);
            return l2;
        }
        return 0L;
    }

    static long a(String[] arrstring) {
        for (String string : arrstring) {
            long l2 = GLContext.a(string);
            if (l2 == 0L) continue;
            return l2;
        }
        return 0L;
    }

    static long a(String string) {
        ByteBuffer byteBuffer = o.a((CharSequence)string);
        return GLContext.ngetFunctionAddress(o.a(byteBuffer));
    }

    private static native long ngetFunctionAddress(long var0);

    static int a(Set set) {
        int n2;
        block11: {
            int n3;
            int n4;
            block10: {
                Object object;
                String string = GL11.v(7938);
                if (string == null) {
                    throw new IllegalStateException("glGetString(GL_VERSION) returned null - possibly caused by missing current context.");
                }
                StringTokenizer stringTokenizer = new StringTokenizer(string, ". ");
                String string2 = stringTokenizer.nextToken();
                String string3 = stringTokenizer.nextToken();
                n4 = 0;
                n3 = 0;
                try {
                    n4 = Integer.parseInt(string2);
                    n3 = Integer.parseInt(string3);
                }
                catch (NumberFormatException numberFormatException) {
                    org.lwjgl.d.a((CharSequence)("The major and/or minor OpenGL version is malformed: " + numberFormatException.getMessage()));
                }
                int[][] arrarrn = new int[][]{{1, 2, 3, 4, 5}, {0, 1}, {0, 1, 2, 3}, {0, 1, 2, 3, 4, 5}};
                for (n2 = 1; n2 <= arrarrn.length; ++n2) {
                    object = arrarrn[n2 - 1];
                    for (int n5 : object) {
                        if (n2 >= n4 && (n2 != n4 || n5 > n3)) continue;
                        set.add("OpenGL" + Integer.toString(n2) + Integer.toString(n5));
                    }
                }
                n2 = 0;
                if (n4 >= 3) break block10;
                object = GL11.v(7939);
                if (object == null) {
                    throw new IllegalStateException("glGetString(GL_EXTENSIONS) returned null - is there a context current?");
                }
                Object object2 = new StringTokenizer((String)object);
                while (((StringTokenizer)object2).hasMoreTokens()) {
                    set.add(((StringTokenizer)object2).nextToken());
                }
                break block11;
            }
            int n6 = GL11.r(33309);
            for (int i2 = 0; i2 < n6; ++i2) {
                set.add(GL30.a(7939, i2));
            }
            if (3 >= n4 && 2 > n3) break block11;
            iy.a();
            try {
                n2 = GL11.r(37158);
                iy.a();
            }
            catch (ig ig2) {
                org.lwjgl.d.a((CharSequence)"Failed to retrieve CONTEXT_PROFILE_MASK");
            }
        }
        return n2;
    }

    static void a(Class class_, Set set, String string) {
        GLContext.resetNativeStubs(class_);
        if (set.contains(string)) {
            try {
                AccessController.doPrivileged(new fv(class_));
            }
            catch (Exception exception) {
                org.lwjgl.d.a((CharSequence)("Failed to initialize extension " + class_ + " - exception: " + exception));
                set.remove(string);
            }
        }
    }

    public static synchronized void b(Object object) {
        GLContext.a(object, false);
    }

    public static synchronized void a(Object object, boolean bl2) {
        if (object == null) {
            dt.a();
            GLContext.a(null);
            if (f) {
                GLContext.c();
            }
            return;
        }
        if (e == 0) {
            GLContext.b();
            f = true;
        }
        try {
            dt dt2 = (dt)d.get(object);
            if (dt2 == null) {
                new dt(bl2);
                d.put(object, GLContext.a());
            } else {
                GLContext.a(dt2);
            }
        }
        catch (c c2) {
            if (f) {
                GLContext.c();
            }
            throw c2;
        }
    }

    public static synchronized void b() {
        if (e == 0) {
            GLContext.nLoadOpenGLLibrary();
        }
        ++e;
    }

    private static native void nLoadOpenGLLibrary();

    public static synchronized void c() {
        if (--e == 0 && org.lwjgl.d.a() != 1) {
            GLContext.nUnloadOpenGLLibrary();
        }
    }

    private static native void nUnloadOpenGLLibrary();

    static native void resetNativeStubs(Class var0);

    static {
        ab.b();
    }
}

