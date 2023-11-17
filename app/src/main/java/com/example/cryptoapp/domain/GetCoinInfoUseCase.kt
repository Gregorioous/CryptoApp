package com.example.cryptoapp.domain

import java.text.DateFormatSymbols

class GetCoinInfoUseCase(private val repository: CoinRepository) {
    operator fun invoke(fromSymbol: String) = repository.getCoinInfo(fromSymbol)
}