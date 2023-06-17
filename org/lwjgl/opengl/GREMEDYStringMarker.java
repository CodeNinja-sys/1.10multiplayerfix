/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class GREMEDYStringMarker {
    private GREMEDYStringMarker() {
    }

    public static void a(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LU;
        a.a(l2);
        a.b(byteBuffer);
        GREMEDYStringMarker.nglStringMarkerGREMEDY(byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglStringMarkerGREMEDY(int var0, long var1, long var3);

    public static void a(CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LU;
        a.a(l2);
        GREMEDYStringMarker.nglStringMarkerGREMEDY(charSequence.length(), i.a(dt2, charSequence), l2);
    }
}

