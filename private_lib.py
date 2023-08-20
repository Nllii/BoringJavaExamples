from ctypes import cdll
lib = cdll.LoadLibrary('./privateLib.so')

class privateMathLib(object):
    def __init__(self):
        pass

    def addition(self, a, b):
        return lib.addition(a, b)
    
    # @OverflowError
    def subtraction(self, a, b):
        return lib.subtraction(a, b)
    
    

