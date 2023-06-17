/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.openal;

import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.EFX10;
import org.lwjgl.openal.d;

public final class c {
    private static final int a = 1111;
    private static final int b = 2222;

    private c() {
    }

    public static boolean a() {
        if (!AL.a()) {
            throw new d("OpenAL has not been created.");
        }
        return ALC10.a(AL.e(), "ALC_EXT_EFX");
    }

    public static boolean a(int n2) {
        switch (n2) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 32768: {
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown or invalid effect type: " + n2);
            }
        }
        return c.a(1111, n2);
    }

    public static boolean b(int n2) {
        switch (n2) {
            case 0: 
            case 1: 
            case 2: 
            case 3: {
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown or invalid filter type: " + n2);
            }
        }
        return c.a(2222, n2);
    }

    private static boolean a(int n2, int n3) {
        switch (n2) {
            case 1111: 
            case 2222: {
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid objectType: " + n2);
            }
        }
        boolean bl2 = false;
        if (c.a()) {
            int n4;
            AL10.a();
            int n5 = 0;
            try {
                switch (n2) {
                    case 1111: {
                        n5 = EFX10.b();
                        break;
                    }
                    case 2222: {
                        n5 = EFX10.c();
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Invalid objectType: " + n2);
                    }
                }
                n4 = AL10.a();
            }
            catch (d d2) {
                n4 = d2.getMessage().contains("AL_OUT_OF_MEMORY") ? 40965 : 40964;
            }
            if (n4 == 0) {
                int n6;
                AL10.a();
                try {
                    switch (n2) {
                        case 1111: {
                            EFX10.b(n5, 32769, n3);
                            break;
                        }
                        case 2222: {
                            EFX10.c(n5, 32769, n3);
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Invalid objectType: " + n2);
                        }
                    }
                    n6 = AL10.a();
                }
                catch (d d3) {
                    n6 = 40963;
                }
                if (n6 == 0) {
                    bl2 = true;
                }
                try {
                    switch (n2) {
                        case 1111: {
                            EFX10.c(n5);
                            break;
                        }
                        case 2222: {
                            EFX10.e(n5);
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Invalid objectType: " + n2);
                        }
                    }
                }
                catch (d d4) {}
            } else if (n4 == 40965) {
                throw new d(n4);
            }
        }
        return bl2;
    }
}

