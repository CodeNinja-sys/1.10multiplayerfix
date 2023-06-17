/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import org.apache.commons.compress.archivers.h.ab;
import org.apache.commons.compress.archivers.h.ax;

class av
extends ab {
    private final ax d;

    av(ax ax2) {
        this.d = ax2;
    }

    ax b() {
        return this.d;
    }

    public int hashCode() {
        return 3 * super.hashCode() + (int)(ax.b(this.d) % Integer.MAX_VALUE);
    }

    public boolean equals(Object object) {
        if (super.equals(object)) {
            av av2 = (av)object;
            return ax.b(this.d) == ax.b(av2.d) && ax.a(this.d) == ax.a(av2.d);
        }
        return false;
    }
}

