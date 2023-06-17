/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.openal;

import org.lwjgl.ab;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.AL11;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALC11;
import org.lwjgl.openal.EFX10;
import org.lwjgl.openal.a;
import org.lwjgl.openal.b;

public final class AL {
    static b a;
    static a b;
    private static boolean c;

    private AL() {
    }

    private static native void nCreate(String var0);

    private static native void nCreateDefault();

    private static native void nDestroy();

    public static boolean a() {
        return c;
    }

    public static void a(String string, int n2, int n3, boolean bl2) {
        AL.a(string, n2, n3, bl2, true);
    }

    public static void a(String string, int n2, int n3, boolean bl2, boolean bl3) {
        String[] arrstring;
        String string2;
        if (c) {
            throw new IllegalStateException("Only one OpenAL context may be instantiated at any one time.");
        }
        switch (d.a()) {
            case 3: {
                if (ab.c()) {
                    string2 = "OpenAL64";
                    arrstring = new String[]{"OpenAL64.dll"};
                    break;
                }
                string2 = "OpenAL32";
                arrstring = new String[]{"OpenAL32.dll"};
                break;
            }
            case 1: {
                string2 = "openal";
                arrstring = new String[]{"libopenal64.so", "libopenal.so", "libopenal.so.0"};
                break;
            }
            case 2: {
                string2 = "openal";
                arrstring = new String[]{"openal.dylib"};
                break;
            }
            default: {
                throw new c("Unknown platform: " + d.a());
            }
        }
        String[] arrstring2 = d.a(string2, arrstring, AL.class.getClassLoader());
        d.a((CharSequence)("Found " + arrstring2.length + " OpenAL paths"));
        for (String string3 : arrstring2) {
            try {
                AL.nCreate(string3);
                c = true;
                AL.b(string, n2, n3, bl2, bl3);
                break;
            }
            catch (c c2) {
                d.a((CharSequence)("Failed to load " + string3 + ": " + c2.getMessage()));
            }
        }
        if (!c && d.a() == 2) {
            AL.nCreateDefault();
            c = true;
            AL.b(string, n2, n3, bl2, bl3);
        }
        if (!c) {
            throw new c("Could not locate OpenAL library.");
        }
    }

    private static void b(String string, int n2, int n3, boolean bl2, boolean bl3) {
        try {
            AL10.initNativeStubs();
            ALC10.initNativeStubs();
            if (bl3) {
                a = ALC10.a(string);
                if (a == null) {
                    throw new c("Could not open ALC device");
                }
                b = n2 == -1 ? ALC10.a(a, null) : ALC10.a(a, org.lwjgl.openal.a.a(n2, n3, bl2 ? 1 : 0));
                ALC10.a(b);
            }
        }
        catch (c c2) {
            AL.c();
            throw c2;
        }
        ALC11.a();
        if (ALC10.a(a, "ALC_EXT_EFX")) {
            EFX10.initNativeStubs();
        }
    }

    public static void b() {
        AL.a(null, 44100, 60, false);
    }

    public static void c() {
        if (b != null) {
            ALC10.a(null);
            ALC10.e(b);
            b = null;
        }
        if (a != null) {
            boolean bl2 = ALC10.a(a);
            a = null;
        }
        AL.resetNativeStubs(AL10.class);
        AL.resetNativeStubs(AL11.class);
        AL.resetNativeStubs(ALC10.class);
        AL.resetNativeStubs(ALC11.class);
        AL.resetNativeStubs(EFX10.class);
        if (c) {
            AL.nDestroy();
        }
        c = false;
    }

    private static native void resetNativeStubs(Class var0);

    public static a d() {
        return b;
    }

    public static b e() {
        return a;
    }

    static {
        ab.b();
    }
}

