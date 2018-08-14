package infrastructure.ports.grpc

/*
import java.util.logging.Logger

import io.grpc.{Server, ServerBuilder}
import io.grpc.examples.helloworld.helloworld._

import scala.concurrent.{ExecutionContext, Future}

import io.grpc.Server
import io.grpc.ServerBuilder
import io.grpc.stub.StreamObserver
import io.grpc.examples.helloworld.helloworld._
import java.io.IOException
import java.util.logging.Logger

class GrpcServer(executionContext: ExecutionContext) { self =>
  private[this] var server: Server = null

  private def start(): Unit = {

    server = ServerBuilder.forPort(50051).addService(GreeterGrpc.bindService(new GreeterImpl, executionContext)).build.start
    println("Server started, listening on " + 50051)
    sys.addShutdownHook {
      System.err.println("*** shutting down gRPC server since JVM is shutting down")
      self.stop()
      System.err.println("*** server shut down")
    }
  }

  private def stop(): Unit = {
    if (server != null) {
      server.shutdown()
    }
  }

  private def blockUntilShutdown(): Unit = {
    if (server != null) {
      server.awaitTermination()
    }
  }

  private class GreeterImpl extends GreeterGrpc.Greeter {
    override def sayHello(req: HelloRequest) = {
      val reply = HelloReply(message = "Hello " + req.name)
      Future.successful(reply)
    }
  }

}

object GrpcServer {
  private val logger = Logger.getLogger(classOf[GrpcServer].getName)

  def main(args: Array[String]): Unit = {
    val server = new GrpcServer(ExecutionContext.global)
    server.start()
    server.blockUntilShutdown()
  }

  private val port = 50051
}

*/

