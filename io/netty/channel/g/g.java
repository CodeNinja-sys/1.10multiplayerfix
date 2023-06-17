/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g;

import com.sun.nio.sctp.AbstractNotificationHandler;
import com.sun.nio.sctp.AssociationChangeNotification;
import com.sun.nio.sctp.HandlerResult;
import com.sun.nio.sctp.Notification;
import com.sun.nio.sctp.PeerAddressChangeNotification;
import com.sun.nio.sctp.SendFailedNotification;
import com.sun.nio.sctp.ShutdownNotification;
import io.netty.channel.g.c;

public final class g
extends AbstractNotificationHandler {
    private final c a;

    public g(c c2) {
        if (c2 == null) {
            throw new NullPointerException("sctpChannel");
        }
        this.a = c2;
    }

    public HandlerResult handleNotification(AssociationChangeNotification associationChangeNotification, Object object) {
        this.a(associationChangeNotification);
        return HandlerResult.CONTINUE;
    }

    public HandlerResult handleNotification(PeerAddressChangeNotification peerAddressChangeNotification, Object object) {
        this.a(peerAddressChangeNotification);
        return HandlerResult.CONTINUE;
    }

    public HandlerResult handleNotification(SendFailedNotification sendFailedNotification, Object object) {
        this.a(sendFailedNotification);
        return HandlerResult.CONTINUE;
    }

    public HandlerResult handleNotification(ShutdownNotification shutdownNotification, Object object) {
        this.a(shutdownNotification);
        this.a.l();
        return HandlerResult.RETURN;
    }

    private void a(Notification notification) {
        this.a.c().a(notification);
    }
}

