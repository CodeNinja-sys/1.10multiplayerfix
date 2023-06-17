/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.a.a.b.dg;
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.minecraft.client.f.ab;
import net.minecraft.client.f.q;

public class am
extends q
implements Closeable {
    public static final dg b = dg.a('/').a().b(3);
    private ZipFile c;

    public am(File file) {
        super(file);
    }

    private ZipFile d() {
        if (this.c == null) {
            this.c = new ZipFile(this.a);
        }
        return this.c;
    }

    @Override
    protected InputStream a(String string) {
        ZipFile zipFile = this.d();
        ZipEntry zipEntry = zipFile.getEntry(string);
        if (zipEntry == null) {
            throw new ab(this.a, string);
        }
        return zipFile.getInputStream(zipEntry);
    }

    @Override
    public boolean b(String string) {
        try {
            return this.d().getEntry(string) != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    @Override
    public Set a() {
        ZipFile zipFile;
        try {
            zipFile = this.d();
        }
        catch (IOException iOException) {
            return Collections.emptySet();
        }
        Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
        HashSet hashSet = aad.a();
        while (enumeration.hasMoreElements()) {
            ArrayList arrayList;
            ZipEntry zipEntry = enumeration.nextElement();
            String string = zipEntry.getName();
            if (!string.startsWith("assets/") || (arrayList = ov.a(b.a(string))).size() <= 1) continue;
            String string2 = (String)arrayList.get(1);
            if (string2.equals(string2.toLowerCase())) {
                hashSet.add(string2);
                continue;
            }
            this.c(string2);
        }
        return hashSet;
    }

    protected void finalize() {
        this.close();
        super.finalize();
    }

    @Override
    public void close() {
        if (this.c != null) {
            this.c.close();
            this.c = null;
        }
    }
}

