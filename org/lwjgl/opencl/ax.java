/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.aa;
import org.lwjgl.opencl.CallbackUtil;

public abstract class ax
extends aa {
    protected ax() {
        super(CallbackUtil.getPrintfCallback());
    }

    protected abstract void a(String var1);
}

