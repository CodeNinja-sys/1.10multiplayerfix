/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.opencl.q;

final class l
extends ThreadLocal {
    l() {
    }

    protected q a() {
        return new q();
    }

    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}

