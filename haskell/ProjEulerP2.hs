main = putStrLn(show sol)
sol = sum [a | a <- takeWhile (<= 4000000) fibonacci, even a]

fibonacci = 1 : 2 : zipWith (+) fibonacci (tail fibonacci)