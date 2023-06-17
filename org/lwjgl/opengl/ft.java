/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.d;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ig;
import org.lwjgl.opengl.is;

class ft {
    private ft() {
    }

    static void a(dt dt2) {
        if (d.j && is.b((dt)dt2).b != 0) {
            throw new ig("Cannot use Buffers when Array Buffer Object is enabled");
        }
    }

    static void b(dt dt2) {
        if (d.j && is.b((dt)dt2).b == 0) {
            throw new ig("Cannot use offsets when Array Buffer Object is disabled");
        }
    }

    static void c(dt dt2) {
        if (d.j && is.c(dt2) != 0) {
            throw new ig("Cannot use Buffers when Element Array Buffer Object is enabled");
        }
    }

    static void d(dt dt2) {
        if (d.j && is.c(dt2) == 0) {
            throw new ig("Cannot use offsets when Element Array Buffer Object is disabled");
        }
    }

    static void e(dt dt2) {
        if (d.j && is.b((dt)dt2).i != 0) {
            throw new ig("Cannot use Buffers when Draw Indirect Object is enabled");
        }
    }

    static void f(dt dt2) {
        if (d.j && is.b((dt)dt2).i == 0) {
            throw new ig("Cannot use offsets when Draw Indirect Object is disabled");
        }
    }

    static void g(dt dt2) {
        if (d.j && is.b((dt)dt2).g != 0) {
            throw new ig("Cannot use Buffers when Pixel Pack Buffer Object is enabled");
        }
    }

    static void h(dt dt2) {
        if (d.j && is.b((dt)dt2).g == 0) {
            throw new ig("Cannot use offsets when Pixel Pack Buffer Object is disabled");
        }
    }

    static void i(dt dt2) {
        if (d.j && is.b((dt)dt2).h != 0) {
            throw new ig("Cannot use Buffers when Pixel Unpack Buffer Object is enabled");
        }
    }

    static void j(dt dt2) {
        if (d.j && is.b((dt)dt2).h == 0) {
            throw new ig("Cannot use offsets when Pixel Unpack Buffer Object is disabled");
        }
    }

    static int a(Buffer buffer, int n2, int n3, int n4, int n5, int n6) {
        return d.j ? ft.a(n2, n3, n4, n5, n6) >> BufferUtils.a(buffer) : 0;
    }

    static int a(Buffer buffer, int n2, int n3, int n4) {
        return d.j ? ft.a(n2, n3, n4) >> BufferUtils.a(buffer) : 0;
    }

    static int a(Buffer buffer, int n2, int n3, int n4, int n5) {
        return d.j ? ft.a(n2, n3, n4, n5) >> BufferUtils.a(buffer) : 0;
    }

    static int b(Buffer buffer, int n2, int n3, int n4, int n5, int n6) {
        return d.j ? ft.b(n2, n3, n4, n5, n6) >> BufferUtils.a(buffer) : 0;
    }

    private static int a(int n2, int n3, int n4, int n5, int n6) {
        return ft.c(n2, n3) * n4 * n5 * n6;
    }

    private static int a(int n2, int n3, int n4) {
        return ft.c(n2, n3) * n4;
    }

    private static int a(int n2, int n3, int n4, int n5) {
        return ft.a(n2, n3, n4) * n5;
    }

    private static int b(int n2, int n3, int n4, int n5, int n6) {
        return ft.a(n2, n3, n4, n5) * n6;
    }

    private static int c(int n2, int n3) {
        int n4;
        int n5;
        switch (n3) {
            case 5120: 
            case 5121: {
                n5 = 1;
                break;
            }
            case 5122: 
            case 5123: {
                n5 = 2;
                break;
            }
            case 5124: 
            case 5125: 
            case 5126: {
                n5 = 4;
                break;
            }
            default: {
                return 0;
            }
        }
        switch (n2) {
            case 6406: 
            case 6409: {
                n4 = 1;
                break;
            }
            case 6410: {
                n4 = 2;
                break;
            }
            case 6407: 
            case 32992: {
                n4 = 3;
                break;
            }
            case 6408: 
            case 32768: 
            case 32993: {
                n4 = 4;
                break;
            }
            default: {
                return 0;
            }
        }
        return n5 * n4;
    }

    static int a(int n2) {
        switch (n2) {
            case 5121: 
            case 37018: {
                return 1;
            }
            case 5123: 
            case 5127: 
            case 37019: {
                return 2;
            }
            case 5128: {
                return 3;
            }
            case 5129: {
                return 4;
            }
        }
        throw new IllegalArgumentException("Unsupported charcode type: " + n2);
    }

    static int b(int n2) {
        switch (n2) {
            case 5120: 
            case 5121: 
            case 37018: {
                return 1;
            }
            case 5122: 
            case 5123: 
            case 5127: 
            case 37019: {
                return 2;
            }
            case 5128: {
                return 3;
            }
            case 5124: 
            case 5125: 
            case 5126: 
            case 5129: {
                return 4;
            }
        }
        throw new IllegalArgumentException("Unsupported path name type: " + n2);
    }

    static int c(int n2) {
        switch (n2) {
            case 0: {
                return 0;
            }
            case 37006: 
            case 37007: {
                return 1;
            }
            case 37008: {
                return 2;
            }
            case 37009: {
                return 3;
            }
            case 37010: 
            case 37014: {
                return 6;
            }
            case 37012: 
            case 37016: {
                return 12;
            }
        }
        throw new IllegalArgumentException("Unsupported transform type: " + n2);
    }

    static int a(int n2, int n3) {
        int n4 = ft.d(n2);
        switch (n3) {
            case 6407: {
                return 3 * n4;
            }
            case 6408: {
                return 4 * n4;
            }
        }
        return n4;
    }

    static int a(FloatBuffer floatBuffer, int n2) {
        if (n2 == 0) {
            return 0;
        }
        return floatBuffer.remaining() / ft.d(n2);
    }

    private static int d(int n2) {
        switch (n2) {
            case 0: {
                return 0;
            }
            case 9217: 
            case 37002: {
                return 3;
            }
            case 9216: {
                return 4;
            }
        }
        throw new IllegalArgumentException("Unsupported gen mode: " + n2);
    }

    static int b(int n2, int n3) {
        if (d.i && (n3 < 0 || n3 % 4 != 0)) {
            throw new IllegalArgumentException("Invalid stride value: " + n3);
        }
        int n4 = Integer.bitCount(n2);
        if (d.i && n3 >> 2 < n4) {
            throw new IllegalArgumentException("The queried metrics do not fit in the specified stride: " + n3);
        }
        return n3 == 0 ? n4 : n3 >> 2;
    }
}

