/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.aa;
import org.lwjgl.opencl.CallbackUtil;

public abstract class ao
extends aa {
    protected ao() {
        super(CallbackUtil.getMemObjectDestructorCallback());
    }

    protected abstract void a(long var1);
}

