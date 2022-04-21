package problems

/*
  In the United Kingdom the currency is made up of pound (£) and pence (p).
  There are eight coins in general circulation:
  1p, 2p, 5p, 10p, 20p, 50p, £1 (100p), and £2 (200p).
  It is possible to make £2 in the following way:
  1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
  
  How many different ways can £2 be made using any number of coins?
  
  https://projecteuler.net/problem=31
*/

def coinSums(coins: Seq[Int], sum: Int): Int =
  if sum == 0 then
    1
  else if sum < 0 || coins.isEmpty then
    0
  else
    coinSums(coins, sum - coins.head) + coinSums(coins.tail, sum)
