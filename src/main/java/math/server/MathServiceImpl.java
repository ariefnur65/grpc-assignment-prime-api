package math.server;

import com.axorean.grpc.math.MathServiceGrpc;
import com.axorean.grpc.math.PrimeRequest;
import com.axorean.grpc.math.PrimeResponse;
import io.grpc.stub.StreamObserver;

public class MathServiceImpl extends MathServiceGrpc.MathServiceImplBase {
    @Override
    public void findAllPrime(PrimeRequest request, StreamObserver<PrimeResponse> responseObserver) {
        long targetNumber = request.getTargetNumber();
    }
}
