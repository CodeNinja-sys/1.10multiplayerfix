/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.lang.reflect.Method;
import java.security.AccessController;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.opengl.LinuxAWTGLCanvasPeerInfo;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.dk;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.gl;
import org.lwjgl.opengl.gm;
import org.lwjgl.opengl.ii;

final class LinuxCanvasImplementation
implements dk {
    LinuxCanvasImplementation() {
    }

    static int a(GraphicsDevice graphicsDevice) {
        try {
            Method method = (Method)AccessController.doPrivileged(new gl(graphicsDevice));
            Integer n2 = (Integer)method.invoke(graphicsDevice, new Object[0]);
            return n2;
        }
        catch (Exception exception) {
            throw new c(exception);
        }
    }

    private static int a(GraphicsConfiguration graphicsConfiguration) {
        try {
            Method method = (Method)AccessController.doPrivileged(new gm(graphicsConfiguration));
            Integer n2 = (Integer)method.invoke(graphicsConfiguration, new Object[0]);
            return n2;
        }
        catch (Exception exception) {
            throw new c(exception);
        }
    }

    public ii a(Canvas canvas, PixelFormat pixelFormat, ds ds2) {
        return new LinuxAWTGLCanvasPeerInfo(canvas);
    }

    public GraphicsConfiguration a(GraphicsDevice graphicsDevice, PixelFormat pixelFormat) {
        try {
            GraphicsConfiguration[] arrgraphicsConfiguration;
            int n2 = LinuxCanvasImplementation.a(graphicsDevice);
            int n3 = LinuxCanvasImplementation.a(n2, pixelFormat);
            for (GraphicsConfiguration graphicsConfiguration : arrgraphicsConfiguration = graphicsDevice.getConfigurations()) {
                int n4 = LinuxCanvasImplementation.a(graphicsConfiguration);
                if (n4 != n3) continue;
                return graphicsConfiguration;
            }
        }
        catch (c c2) {
            d.a((CharSequence)("Got exception while trying to determine configuration: " + c2));
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    private static int a(int var0, PixelFormat var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 3[TRYBLOCK]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    private static native int nFindVisualIDFromFormat(long var0, int var2, PixelFormat var3);
}

