/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.b;

import java.util.Arrays;

class d {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    long i;
    long j;
    long k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    int r;
    int s;
    String t;
    String u;
    byte[][] v = null;

    d() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocalFileHeader [archiverVersionNumber=");
        stringBuilder.append(this.a);
        stringBuilder.append(", minVersionToExtract=");
        stringBuilder.append(this.b);
        stringBuilder.append(", hostOS=");
        stringBuilder.append(this.c);
        stringBuilder.append(", arjFlags=");
        stringBuilder.append(this.d);
        stringBuilder.append(", method=");
        stringBuilder.append(this.e);
        stringBuilder.append(", fileType=");
        stringBuilder.append(this.f);
        stringBuilder.append(", reserved=");
        stringBuilder.append(this.g);
        stringBuilder.append(", dateTimeModified=");
        stringBuilder.append(this.h);
        stringBuilder.append(", compressedSize=");
        stringBuilder.append(this.i);
        stringBuilder.append(", originalSize=");
        stringBuilder.append(this.j);
        stringBuilder.append(", originalCrc32=");
        stringBuilder.append(this.k);
        stringBuilder.append(", fileSpecPosition=");
        stringBuilder.append(this.l);
        stringBuilder.append(", fileAccessMode=");
        stringBuilder.append(this.m);
        stringBuilder.append(", firstChapter=");
        stringBuilder.append(this.n);
        stringBuilder.append(", lastChapter=");
        stringBuilder.append(this.o);
        stringBuilder.append(", extendedFilePosition=");
        stringBuilder.append(this.p);
        stringBuilder.append(", dateTimeAccessed=");
        stringBuilder.append(this.q);
        stringBuilder.append(", dateTimeCreated=");
        stringBuilder.append(this.r);
        stringBuilder.append(", originalSizeEvenForVolumes=");
        stringBuilder.append(this.s);
        stringBuilder.append(", name=");
        stringBuilder.append(this.t);
        stringBuilder.append(", comment=");
        stringBuilder.append(this.u);
        stringBuilder.append(", extendedHeaders=");
        stringBuilder.append(Arrays.toString((Object[])this.v));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

