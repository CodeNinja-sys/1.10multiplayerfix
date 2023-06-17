/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.IllegalComponentStateException;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.nio.IntBuffer;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import org.lwjgl.d;
import org.lwjgl.opengl.do;
import org.lwjgl.opengl.dp;

final class dn {
    dn() {
    }

    public static boolean a() {
        return true;
    }

    public static int b() {
        return 3;
    }

    public static int c() {
        if (d.a() != 2 || d.a(10, 4)) {
            int n2 = Toolkit.getDefaultToolkit().getMaximumCursorColors();
            boolean bl2 = n2 >= 32767 && dn.e() > 0;
            int n3 = bl2 ? 3 : 4;
            return n3;
        }
        return 0;
    }

    public static Robot a(Component component) {
        try {
            return (Robot)AccessController.doPrivileged(new do(component));
        }
        catch (PrivilegedActionException privilegedActionException) {
            d.a((CharSequence)("Got exception while creating robot: " + privilegedActionException.getCause()));
            return null;
        }
    }

    private static int a(Component component, int n2) {
        return component.getHeight() - 1 - n2;
    }

    private static Point c(Component component) {
        try {
            GraphicsConfiguration graphicsConfiguration = component.getGraphicsConfiguration();
            if (graphicsConfiguration != null) {
                PointerInfo pointerInfo = (PointerInfo)AccessController.doPrivileged(new dp());
                GraphicsDevice graphicsDevice = pointerInfo.getDevice();
                if (graphicsDevice == graphicsConfiguration.getDevice()) {
                    return pointerInfo.getLocation();
                }
                return null;
            }
        }
        catch (Exception exception) {
            d.a((CharSequence)("Failed to query pointer location: " + exception.getCause()));
        }
        return null;
    }

    public static Point b(Component component) {
        try {
            Point point = dn.c(component);
            if (point != null) {
                Point point2 = component.getLocationOnScreen();
                point.translate(-point2.x, -point2.y);
                point.move(point.x, dn.a(component, point.y));
                return point;
            }
        }
        catch (IllegalComponentStateException illegalComponentStateException) {
            d.a((CharSequence)("Failed to set cursor position: " + illegalComponentStateException));
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            d.a((CharSequence)("Failed to query cursor position: " + noClassDefFoundError));
        }
        return null;
    }

    public static void a(Component component, Robot robot, int n2, int n3) {
        if (robot != null) {
            try {
                Point point = component.getLocationOnScreen();
                int n4 = point.x + n2;
                int n5 = point.y + dn.a(component, n3);
                robot.mouseMove(n4, n5);
            }
            catch (IllegalComponentStateException illegalComponentStateException) {
                d.a((CharSequence)("Failed to set cursor position: " + illegalComponentStateException));
            }
        }
    }

    public static int d() {
        Dimension dimension = Toolkit.getDefaultToolkit().getBestCursorSize(0, 0);
        return Math.max(dimension.width, dimension.height);
    }

    public static int e() {
        Dimension dimension = Toolkit.getDefaultToolkit().getBestCursorSize(10000, 10000);
        return Math.min(dimension.width, dimension.height);
    }

    public static Cursor a(int n2, int n3, int n4, int n5, int n6, IntBuffer intBuffer, IntBuffer intBuffer2) {
        BufferedImage bufferedImage = new BufferedImage(n2, n3, 2);
        int[] arrn = new int[intBuffer.remaining()];
        int n7 = intBuffer.position();
        intBuffer.get(arrn);
        intBuffer.position(n7);
        bufferedImage.setRGB(0, 0, n2, n3, arrn, 0, n2);
        return Toolkit.getDefaultToolkit().createCustomCursor(bufferedImage, new Point(n4, n5), "LWJGL Custom cursor");
    }
}

