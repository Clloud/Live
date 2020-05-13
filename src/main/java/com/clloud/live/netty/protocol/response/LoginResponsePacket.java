package com.clloud.live.netty.protocol.response;

import static com.clloud.live.netty.protocol.Command.LOGIN_RESPONSE;
import com.clloud.live.netty.protocol.Packet;

public class LoginResponsePacket extends Packet {
    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
