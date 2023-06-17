/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Component;
import java.awt.Robot;
import java.security.PrivilegedExceptionAction;

final class do
implements PrivilegedExceptionAction {
    final /* synthetic */ Component a;

    do(Component component) {
        this.a = component;
    }

    public Robot a() {
        return new Robot(this.a.getGraphicsConfiguration().getDevice());
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

