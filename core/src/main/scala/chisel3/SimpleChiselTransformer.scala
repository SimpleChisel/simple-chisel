package chisel3.simplechisel.internal

import chisel3._
import chisel3.internal._
import chisel3.internal.firrtl._
import chisel3.experimental._

object SimpleChiselTranformer{
    //replace lId with rId in ctx and return the new ctx
    def replace(lId: Arg, rId: Arg, ctx: ArrayBuffer[Command]): Option[rrayBuffer[Command]] ={
        //TODO
        return replaceWhen(lId, rId, ctx)(true)
    }

    //replace lId with rId in ctx and return the new ctx
    def replaceWhen(lId: Arg, rId: Arg, ctx: ArrayBuffer[Command])(pred: () => Boolean): Option[ArrayBuffer[Command]] ={
        //TODO
        return None
    }

    def removeIfSafe(id: Arg, ctx: ArrayBuffer[Command]): Option[ArrayBuffer[Command]] ={
        //TODO
        return None   
    }

    // find the most front place to insert the cmd
    def Insert(cmd: Command, ctx: ArrayBuffer[Command]): Option[ArrayBuffer[Command]] ={
        //TODO
        return None   
    }

    // Update functions (Optional)
}