import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

 @Test
 fun tryTransferMoneyTrue() {
  //typeCard: String, preTransfer: Int = 0, transfer: Int
  val typeCard = "Mastercard"
  val preTransfer = 0
  val transfer = 75_000

  var res = tryTransferMoney(typeCard, preTransfer, transfer)
  assertEquals(true, res)
 }
 @Test
 fun tryTransferMoneyFalse() {
  //typeCard: String, preTransfer: Int = 0, transfer: Int
  val typeCard = "Mastercard"
  val preTransfer = 750_001
  val transfer = 750_000

  var res = tryTransferMoney(typeCard, preTransfer, transfer)
  assertEquals(false, res)
 }
}