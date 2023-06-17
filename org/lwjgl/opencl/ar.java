/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.d;
import org.lwjgl.opencl.aq;
import org.lwjgl.opencl.at;

abstract class ar
extends at {
    private final aq b;

    protected ar(long l2, aq aq2) {
        super(l2);
        if (d.i && aq2 != null && !aq2.b()) {
            throw new IllegalStateException("The parent specified is not a valid CL object.");
        }
        this.b = aq2;
    }

    public aq m() {
        return this.b;
    }
}

