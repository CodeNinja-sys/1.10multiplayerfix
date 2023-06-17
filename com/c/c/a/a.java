/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.c.c.a.b;
import com.c.c.b.ab;
import com.c.c.d.a.z;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.s.l;
import net.minecraft.s.q;
import org.apache.a.c.c.e;
import org.apache.a.c.c.j;
import org.apache.a.i.b.ai;
import org.apache.a.i.b.m;
import org.apache.commons.c.am;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class a {
    private static final d a = org.apache.logging.log4j.c.c();
    private volatile boolean b = false;
    private volatile boolean c = false;
    private volatile boolean d = false;
    private volatile boolean e = false;
    private volatile File f;
    private volatile File g;
    private volatile j h;
    private Thread i;
    private org.apache.a.c.a.c j = org.apache.a.c.a.c.q().d(120000).c(120000).a();
    private static final String[] k = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public long a(String string) {
        Closeable closeable = null;
        j j2 = null;
        try {
            j2 = new j(string);
            closeable = ai.a().a(this.j).i();
            e e2 = ((m)closeable).b(j2);
            long l2 = Long.parseLong(e2.c("Content-Length").d());
            return l2;
        }
        catch (Throwable throwable) {
            a.b("Unable to get content length for download");
            long l3 = 0L;
            return l3;
        }
        finally {
            if (j2 != null) {
                j2.m();
            }
            if (closeable != null) {
                try {
                    closeable.close();
                }
                catch (IOException iOException) {
                    a.b("Could not close http client", (Throwable)iOException);
                }
            }
        }
    }

    public void a(ab ab2, String string, z z2, net.minecraft.s.c c2) {
        if (this.i != null) {
            return;
        }
        this.i = new b(this, ab2, z2, string, c2);
        this.i.start();
    }

    public void a() {
        if (this.h != null) {
            this.h.cK_();
        }
        if (this.f != null) {
            this.f.delete();
        }
        this.b = true;
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public static String b(String string) {
        string = string.replaceAll("[\\./\"]", "_");
        for (String string2 : k) {
            if (!string.equalsIgnoreCase(string2)) continue;
            string = "_" + string + "_";
        }
        return string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(String string, File file, net.minecraft.s.c c2) {
        String string2;
        Pattern pattern = Pattern.compile(".*-([0-9]+)$");
        int n2 = 1;
        for (char c3 : q.d) {
            string = string.replace(c3, '_');
        }
        if (am.a((CharSequence)string)) {
            string = "Realm";
        }
        string = com.c.c.a.a.b(string);
        try {
            Object object = c2.c().iterator();
            while (object.hasNext()) {
                l l2 = (l)object.next();
                if (!l2.b().toLowerCase().startsWith(string.toLowerCase())) continue;
                Matcher matcher = pattern.matcher(l2.b());
                if (matcher.matches()) {
                    if (Integer.valueOf(matcher.group(1)) <= n2) continue;
                    n2 = Integer.valueOf(matcher.group(1));
                    continue;
                }
                ++n2;
            }
        }
        catch (Exception exception) {
            this.d = true;
            return;
        }
        if (!c2.c(string) || n2 > 1) {
            string2 = string + (n2 == 1 ? "" : "-" + n2);
            if (!c2.c(string2)) {
                boolean bl2 = false;
                while (!bl2) {
                    string2 = string + (++n2 == 1 ? "" : "-" + n2);
                    if (!c2.c(string2)) continue;
                    bl2 = true;
                }
            }
        } else {
            string2 = string;
        }
        org.apache.commons.compress.archivers.g.b b2 = null;
        File file2 = new File(net.minecraft.s.b.i(), "saves");
        try {
            file2.mkdir();
            b2 = new org.apache.commons.compress.archivers.g.b(new org.apache.commons.compress.b.b.a(new BufferedInputStream(new FileInputStream(file))));
            Object object = b2.e();
            while (object != null) {
                File file3 = new File(file2, ((org.apache.commons.compress.archivers.g.a)object).getName().replace("world", string2));
                if (((org.apache.commons.compress.archivers.g.a)object).isDirectory()) {
                    file3.mkdirs();
                } else {
                    file3.createNewFile();
                    byte[] arrby = new byte[1024];
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                    int n3 = 0;
                    while ((n3 = b2.read(arrby)) != -1) {
                        bufferedOutputStream.write(arrby, 0, n3);
                    }
                    bufferedOutputStream.close();
                    arrby = null;
                }
                object = b2.e();
            }
        }
        catch (Exception exception) {
            this.d = true;
        }
        finally {
            if (b2 != null) {
                b2.close();
            }
            if (file != null) {
                file.delete();
            }
            net.minecraft.s.c c4 = c2;
            c4.a(string2, string2.trim());
            File file4 = new File(file2, string2 + File.separator + "level.dat");
            net.minecraft.s.b.a(file4);
            this.g = new File(file2, string2 + File.separator + "resources.zip");
        }
    }

    static /* synthetic */ File a(a a2, File file) {
        a2.f = file;
        return a2.f;
    }

    static /* synthetic */ j a(a a2, j j2) {
        a2.h = j2;
        return a2.h;
    }

    static /* synthetic */ org.apache.a.c.a.c a(a a2) {
        return a2.j;
    }

    static /* synthetic */ j b(a a2) {
        return a2.h;
    }

    static /* synthetic */ boolean a(a a2, boolean bl2) {
        a2.d = bl2;
        return a2.d;
    }

    static /* synthetic */ File c(a a2) {
        return a2.f;
    }

    static /* synthetic */ d e() {
        return a;
    }

    static /* synthetic */ boolean d(a a2) {
        return a2.d;
    }

    static /* synthetic */ boolean b(a a2, boolean bl2) {
        a2.c = bl2;
        return a2.c;
    }

    static /* synthetic */ boolean e(a a2) {
        return a2.b;
    }

    static /* synthetic */ boolean c(a a2, boolean bl2) {
        a2.e = bl2;
        return a2.e;
    }

    static /* synthetic */ void a(a a2, String string, File file, net.minecraft.s.c c2) {
        a2.a(string, file, c2);
    }

    static /* synthetic */ File f(a a2) {
        return a2.g;
    }
}

