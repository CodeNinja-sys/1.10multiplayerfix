/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.util.List;
import org.lwjgl.c;
import org.lwjgl.opengl.gr;
import org.lwjgl.opengl.gs;
import org.lwjgl.opengl.gw;

class gu
implements gw {
    private static final String b = "/apps/compiz/plugins/workarounds/allscreens/options/legacy_fullscreen";
    final /* synthetic */ gs a;

    gu(gs gs2) {
        this.a = gs2;
    }

    public boolean a() {
        List list = gr.a(new String[]{"gconftool", "-g", b});
        if (list == null || list.size() == 0) {
            throw new c("Invalid gconftool reply.");
        }
        return Boolean.parseBoolean(((String)list.get(0)).trim());
    }

    public void a(boolean bl2) {
        if (gr.a(new String[]{"gconftool", "-s", b, "-s", Boolean.toString(bl2), "-t", "bool"}) == null) {
            throw new c("Failed to apply Compiz LFS workaround.");
        }
        if (bl2) {
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
}

