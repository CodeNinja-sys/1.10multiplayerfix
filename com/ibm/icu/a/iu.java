/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.it;
import com.ibm.icu.a.iw;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

class iu
extends it {
    File b;

    iu(URL uRL) {
        try {
            this.b = new File(uRL.toURI());
        }
        catch (URISyntaxException uRISyntaxException) {
            // empty catch block
        }
        if (this.b == null || !this.b.exists()) {
            if (it.a()) {
                System.err.println("file does not exist - " + uRL.toString());
            }
            throw new IllegalArgumentException();
        }
    }

    public void a(iw iw2, boolean bl2, boolean bl3) {
        if (this.b.isDirectory()) {
            this.a(iw2, bl2, bl3, "/", this.b.listFiles());
        } else {
            iw2.a(this.b.getName());
        }
    }

    private void a(iw iw2, boolean bl2, boolean bl3, String string, File[] arrfile) {
        for (int i2 = 0; i2 < arrfile.length; ++i2) {
            File file = arrfile[i2];
            if (file.isDirectory()) {
                if (!bl2) continue;
                this.a(iw2, bl2, bl3, string + file.getName() + '/', file.listFiles());
                continue;
            }
            iw2.a(bl3 ? file.getName() : string + file.getName());
        }
    }
}

