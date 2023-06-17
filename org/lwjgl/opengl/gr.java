/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.c;
import org.lwjgl.opengl.dx;
import org.lwjgl.opengl.gs;
import org.lwjgl.opengl.gv;
import org.lwjgl.opengl.gw;

final class gr {
    private static boolean a;
    private static gw b;

    private gr() {
    }

    static void a() {
        if (dx.b("org.lwjgl.opengl.Window.nocompiz_lfs")) {
            return;
        }
        AccessController.doPrivileged(new gs());
    }

    static void a(boolean bl2) {
        if (!a) {
            return;
        }
        AccessController.doPrivileged(new gv(bl2));
    }

    private static List b(String ... arrstring) {
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            String string;
            Process process = Runtime.getRuntime().exec(arrstring);
            try {
                int n2 = process.waitFor();
                if (n2 != 0) {
                    return null;
                }
            }
            catch (InterruptedException interruptedException) {
                throw new c("Process interrupted.", interruptedException);
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((string = bufferedReader.readLine()) != null) {
                arrayList.add(string);
            }
            bufferedReader.close();
        }
        catch (IOException iOException) {
            throw new c("Process failed.", iOException);
        }
        return arrayList;
    }

    private static boolean b(String string) {
        List list = gr.b("ps", "-C", string);
        if (list == null) {
            return false;
        }
        for (String string2 : list) {
            if (!string2.contains(string)) continue;
            return true;
        }
        return false;
    }

    static /* synthetic */ boolean a(String string) {
        return gr.b(string);
    }

    static /* synthetic */ gw a(gw gw2) {
        b = gw2;
        return b;
    }

    static /* synthetic */ List a(String[] arrstring) {
        return gr.b(arrstring);
    }

    static /* synthetic */ gw b() {
        return b;
    }

    static /* synthetic */ boolean b(boolean bl2) {
        a = bl2;
        return a;
    }
}

