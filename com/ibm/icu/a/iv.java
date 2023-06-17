/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.it;
import com.ibm.icu.a.iw;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

class iv
extends it {
    JarFile b;
    String c;

    iv(URL uRL) {
        try {
            Object object;
            int n2;
            String string;
            this.c = uRL.getPath();
            int n3 = this.c.lastIndexOf("!/");
            if (n3 >= 0) {
                this.c = this.c.substring(n3 + 2);
            }
            if (!(string = uRL.getProtocol()).equals("jar") && (n2 = ((String)(object = uRL.toString())).indexOf(":")) != -1) {
                uRL = new URL("jar" + ((String)object).substring(n2));
            }
            object = (JarURLConnection)uRL.openConnection();
            this.b = ((JarURLConnection)object).getJarFile();
        }
        catch (Exception exception) {
            if (it.a()) {
                System.err.println("icurb jar error: " + exception);
            }
            throw new IllegalArgumentException("jar error: " + exception.getMessage());
        }
    }

    public void a(iw iw2, boolean bl2, boolean bl3) {
        block5: {
            try {
                Enumeration<JarEntry> enumeration = this.b.entries();
                while (enumeration.hasMoreElements()) {
                    String string;
                    JarEntry jarEntry = enumeration.nextElement();
                    if (jarEntry.isDirectory() || !(string = jarEntry.getName()).startsWith(this.c)) continue;
                    int n2 = (string = string.substring(this.c.length())).lastIndexOf(47);
                    if (n2 != -1) {
                        if (!bl2) continue;
                        if (bl3) {
                            string = string.substring(n2 + 1);
                        }
                    }
                    iw2.a(string);
                }
            }
            catch (Exception exception) {
                if (!it.a()) break block5;
                System.err.println("icurb jar error: " + exception);
            }
        }
    }
}

