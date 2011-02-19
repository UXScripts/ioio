package ioio.lib;

/**
 * Interface for the IOIO proto.
 *
 * ytai: probably want a few of those: disconnection, abortion, unsupported board.
 * arshan: agreed, will add as needed, wanted to get basic functions in first.
 *
 * TODO(TF): flesh out exceptions
 *
 * @author arshan
 */
public class IOIOException extends Exception {

	public IOIOException() {
		super("IOIOException");
	}

	public IOIOException(String msg) {
		super(msg);
	}

	public static class ConnectionLostException extends IOIOException {
	    public ConnectionLostException(String msg) {
	        super(msg);
        }
	}

    public static class OperationAbortedException extends IOIOException {
        public OperationAbortedException(String msg) {
            super(msg);
        }
    }

    public static class UnsupportedBoardException extends IOIOException {
        public UnsupportedBoardException(String msg) {
            super(msg);
        }
    }

    public static class InvalidStateException extends IOIOException {
        public InvalidStateException(String msg) {
            super(msg);
        }
    }

    public static class OutOfResourceException extends IOIOException {
        public OutOfResourceException(String msg) {
            super(msg);
        }
    }

    public static class InvalidOperationException extends IOIOException {
        public InvalidOperationException(String msg) {
            super(msg);
        }
    }

    public static class SocketException extends IOIOException {
        public SocketException(String msg) {
            super(msg);
        }
    }
}
