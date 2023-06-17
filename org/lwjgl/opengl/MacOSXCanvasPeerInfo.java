/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ComponentListener;
import java.nio.ByteBuffer;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import org.lwjgl.opengl.AWTSurfaceLock;
import org.lwjgl.opengl.MacOSXPeerInfo;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.hc;

abstract class MacOSXCanvasPeerInfo
extends MacOSXPeerInfo {
    private final AWTSurfaceLock b = new AWTSurfaceLock();
    public ByteBuffer a;

    protected MacOSXCanvasPeerInfo(PixelFormat pixelFormat, ds ds2, boolean bl2) {
        super(pixelFormat, ds2, true, true, bl2, true);
    }

    protected void a(Canvas canvas) {
        boolean bl2 = true;
        boolean bl3 = true;
        String string = System.getProperty("java.version");
        if (string.startsWith("1.5") || string.startsWith("1.6")) {
            bl2 = false;
        } else if (string.startsWith("1.7")) {
            bl3 = false;
        }
        Insets insets = MacOSXCanvasPeerInfo.c(canvas);
        int n2 = insets != null ? insets.top : 0;
        int n3 = insets != null ? insets.left : 0;
        this.a = MacOSXCanvasPeerInfo.nInitHandle(this.b.a(canvas), this.h(), this.a, bl2, bl3, canvas.getX() - n3, canvas.getY() - n2);
        if (string.startsWith("1.7")) {
            this.b(canvas);
            MacOSXCanvasPeerInfo.b(canvas, this.h());
        }
    }

    private void b(Canvas canvas) {
        ComponentListener[] arrcomponentListener = canvas.getComponentListeners();
        for (int i2 = 0; i2 < arrcomponentListener.length; ++i2) {
            ComponentListener componentListener = arrcomponentListener[i2];
            if (componentListener.toString() != "CanvasPeerInfoListener") continue;
            return;
        }
        hc hc2 = new hc(this, canvas);
        canvas.addComponentListener(hc2);
    }

    private static native ByteBuffer nInitHandle(ByteBuffer var0, ByteBuffer var1, ByteBuffer var2, boolean var3, boolean var4, int var5, int var6);

    private static native void nSetLayerPosition(ByteBuffer var0, int var1, int var2);

    private static native void nSetLayerBounds(ByteBuffer var0, int var1, int var2, int var3, int var4);

    private static void b(Canvas canvas, ByteBuffer byteBuffer) {
        Component component = SwingUtilities.getRoot(canvas);
        Point point = SwingUtilities.convertPoint(canvas.getParent(), canvas.getLocation(), component);
        int n2 = (int)point.getX();
        int n3 = (int)point.getY();
        Insets insets = MacOSXCanvasPeerInfo.c(canvas);
        int n4 = insets != null ? insets.left : 0;
        n3 -= insets != null ? insets.top : 0;
        n3 = component.getHeight() - n3 - canvas.getHeight();
        MacOSXCanvasPeerInfo.nSetLayerBounds(byteBuffer, n2 -= n4, n3, canvas.getWidth(), canvas.getHeight());
    }

    protected void b() {
        this.b.a();
    }

    private static Insets c(Canvas canvas) {
        JRootPane jRootPane = SwingUtilities.getRootPane(canvas);
        if (jRootPane != null) {
            return ((Container)jRootPane).getInsets();
        }
        return new Insets(0, 0, 0, 0);
    }

    static /* synthetic */ void a(Canvas canvas, ByteBuffer byteBuffer) {
        MacOSXCanvasPeerInfo.b(canvas, byteBuffer);
    }
}

