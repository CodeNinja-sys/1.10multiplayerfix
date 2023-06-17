/*
 * Decompiled with CFR 0.150.
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.util.a.c;

public class avj {
    public static synchronized int a(int n2) {
        int n3 = cja.q(n2);
        if (n3 == 0) {
            int n4 = cja.I();
            String string = "No error code reported";
            if (n4 != 0) {
                string = c.b(n4);
            }
            throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + n2 + ", GL error (" + n4 + "): " + string);
        }
        return n3;
    }

    public static synchronized void a(int n2, int n3) {
        cja.e(n2, n3);
    }

    public static synchronized void b(int n2) {
        avj.a(n2, 1);
    }

    public static synchronized ByteBuffer c(int n2) {
        return ByteBuffer.allocateDirect(n2).order(ByteOrder.nativeOrder());
    }

    public static IntBuffer d(int n2) {
        return avj.c(n2 << 2).asIntBuffer();
    }

    public static FloatBuffer e(int n2) {
        return avj.c(n2 << 2).asFloatBuffer();
    }
}

