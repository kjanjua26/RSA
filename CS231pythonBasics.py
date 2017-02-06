"""

Revising Python for Neural Net Course.
Python doesn't have the increment or the decrerment operator.
Python implements all of the usual operators for Boolean Logic.

"""

#The quicksort algorithm in Python.
arr = [3,6,8,10,9,2,1]
def quicksort(arr):
	if len(arr) <= 1:
		return arr
	pivot = arr[len(arr)/2]
	left  = [x for x in arr if x < pivot]
	middle = [x for x in arr if x == pivot]
	right = [x for x in arr if x > pivot]
	return quicksort(left) + middle + quicksort(right)
print "The input array is: "
print arr
print "The sorted array is: "
print quicksort(arr)

"""
operators in Python

"""
t = True
f = False
print type(t)
print t and f #logical and
print t or f #logical or
print not t #not t = False
print t != f #logical xor

"""
Strings in Python

"""
hello = 'hello'
world = "world" #same as 'world'
print hello
print world
print len(world) #string length
hw = hello + ' ' + world #string concatenation
print hw
hw12 = '%s %s %d' % (hello, world, 12) #sprintf style string formating
print hw12 #prints "hello world 12"

"""
String operations

"""
s = "hello"
print s.capitalize() #capitalize a string
print s.upper() #uppercase a string
print s.rjust(7) #right justify a string, pads spaces
print s.center(7) #center justify
print s.replace('l', '(ell)') #replaces all instances
print ' world '.strip() #strips leading and trailing spaces

"""
lists in Python

"""
sx = [3, 1, 2]
print sx, sx[2] #prints the list and element no. 2
print sx[-1] #negative indices, count from end
sx[2] = 'foo' #lists can contain elements of diff type
print sx #prints with added foo in place of 2
sx.append('bar') #appends element
x = sx.pop() #remove and return the last element of list
#x = bar

"""
Slicing in Python

"""
num = range(5) #built in function 
print num #prints 0,1,2,3,4
print num[2:4] #get a slice from index 2 to 4
print num[2:] #get from index 2 to end
print[:2] #get a slice from start, 0, to 2
print num[:] #get a slice of whole list
print num[:-1] #get a slice till last digit, i.e. from 0 to 3
num[2:4] = [8,9] #assign a new sublist to slice
#2 index contains 8, 4 index contains 9
print num

"""
Loops in python

"""
animals = ['dog', 'zebra', 'cat']
for animal in animals:
	print animal

#To access the index, enum is used
for idn, animal in enumerate(animals):
	print '%d: %s' % (idn + 1, animal)

list = [0, 1, 4, 6, 8]
squares = [x ** 2 for x in list if x % 2 == 0]
print squares #do x ** 2 for every x in list. Can add the if condition.

"""
Dictionaries: Store key, values pairs

""" 
d = {'cat' : 'meow', 'dog' : 'bow'}
print d['cat'] #gets an entry from dictionary, prints meow.
print 'cat' in d #checks if the dictionary d has the entry, prints true if yes.
print d.get('monkey', 'N/A') #get an element with a default. Prints N/A
d['fish'] = 'water'
print d.get('fish', 'N/A') #prints water
del d['fish'] #removes element from dictionary
print d.get['fish'] #fish no longer present, so prints N/A

dic = {'person':2, 'cat':5, 'spider':6}
for animal in dic:
	num = dic[animal]
	print 'A %s has %d number.' % (animal, num)

#A more simple way to iterate through the dictionary is: iteritems
for animal, num in dic.iteritems():
	print 'A %s has %d number.' % (animal, num)

nums = [0, 1, 2, 3, 4]
even_num_to_square = {x: x ** 2 for x in nums if x % 2 == 0}
print even_num_to_square  # Prints "{0: 0, 2: 4, 4: 16}", x and operation's value on x

"""
Sets: An unordered collection of distinct elements. 
Cannot make assumptions about the order in which elements are visited

"""
animals = {'cat', 'dog'}
print 'cat' in animals #prints true since cat is there and false if not
animals.add('fish')
print 'fish' in animals #prints true since now fish is added
print len(animals) #prints the no. of elements
animals.remove('cat') #removes an element

from math import sqrt
num = {int(sqrt(x)) for x in range(30)}
print num #prints set of integers from 0 to 30 on which sqrt func has been performed

"""
Tuples: ordered list of values. Tuples can be used as keys in dictionary and as elements of sets.

"""
d = {(x, x + 1): x for x in range(10)}
t = (5, 6)
print d[t] #prints 5
print d[(1, 2)] #prints 1

"""
Functions: User defined Functions

"""
def sign(x):
    if x > 0:
        return 'positive'
    elif x < 0:
        return 'negative'
    else:
        return 'zero'

for x in [-1, 0, 1]:
    print sign(x)

#Functions taking variables with values.

def hello(name, loud=False):
    if loud:
        print 'HELLO, %s!' % name.upper()
    else:
        print 'Hello, %s' % name

hello('Bob') # Prints "Hello, Bob"
hello('Fred', loud=True)  # Prints "HELLO, FRED!"

"""
Numpy

"""

import numpy as np
a = np.array([1, 2, 3])
print a.shape #prints (3, )
print a[0], a[1], a[2]   # Prints "1 2 3"
a[0] = 5                 # Change an element of the array
print a                  # Prints "[5, 2, 3]"

b = np.array([[1,2,3],[4,5,6]])   # Create a rank 2 array, 2d array
print b.shape                     # Prints "(2, 3)"
print b[0, 0], b[0, 1], b[1, 0]   # Prints "1 2 4"

#b[1, 0], 1 shows array no. which is second since index is 0, 0 shows first element
a = np.zeros((2,2))  # Create an array of all zeros
print a              # Prints "[[ 0.  0.]
                     #          [ 0.  0.]]"
    
b = np.ones((1,2))   # Create an array of all ones
print b              # Prints "[[ 1.  1.]]"

c = np.full((2,2), 7) # Create a constant array
print c               # Prints "[[ 7.  7.]
                      #          [ 7.  7.]]"

d = np.eye(2)        # Create a 2x2 identity matrix
print d              # Prints "[[ 1.  0.]
                     #          [ 0.  1.]]"
    
e = np.random.random((2,2)) # Create an array filled with random values
print e                     # Might print "[[ 0.91940167  0.08143941]
                            #               [ 0.68744134  0.8723]]"

"""
Array indexing

"""
g = np.array([[1,2], [3, 4], [5,6]])
print g[[0,1,2],[0,1,0]]
print np.array([g[0,0], g[1,1], g[2,0]]) #both are same.
#g[0,1,2], [0,1,0] means [0,0], [1,1], [2,0]
a = np.array([[1,2,3], [4,5,6], [7,8,9], [10, 11, 12]])

print a  # prints "array([[ 1,  2,  3],
         #                [ 4,  5,  6],
         #                [ 7,  8,  9],
         #                [10, 11, 12]])"

# Create an array of indices
b = np.array([0, 2, 0, 1])

# Select one element from each row of a using the indices in b
print a[np.arange(4), b]  # Prints "[ 1  6  7 11]"

# Mutate one element from each row of a using the indices in b
a[np.arange(4), b] += 10

print a  # prints "array([[11,  2,  3],
         #                [ 4,  5, 16],
         #                [17,  8,  9],
         #                [10, 21, 12]])

a = np.array([[1,2], [3, 4], [5, 6]])

bool_idx = (a > 2)  # Find the elements of a that are bigger than 2;
                    # this returns a numpy array of Booleans of the same
                    # shape as a, where each slot of bool_idx tells
                    # whether that element of a is > 2.
            
print bool_idx      # Prints "[[False False]
                    #          [ True  True]
                    #          [ True  True]]"

# We use boolean array indexing to construct a rank 1 array
# consisting of the elements of a corresponding to the True values
# of bool_idx
print a[bool_idx]  # Prints "[3 4 5 6]"

# We can do all of the above in a single concise statement:
print a[a > 2]     # Prints "[3 4 5 6]"

x = np.array([[1,2],[3,4]], dtype=np.float64)
y = np.array([[5,6],[7,8]], dtype=np.float64)

# Elementwise sum; both produce the array
# [[ 6.0  8.0]
#  [10.0 12.0]]
print x + y
print np.add(x, y)

# Elementwise difference; both produce the array
# [[-4.0 -4.0]
#  [-4.0 -4.0]]
print x - y
print np.subtract(x, y)

# Elementwise product; both produce the array
# [[ 5.0 12.0]
#  [21.0 32.0]]
print x * y
print np.multiply(x, y)

# Elementwise division; both produce the array
# [[ 0.2         0.33333333]
#  [ 0.42857143  0.5       ]]
print x / y
print np.divide(x, y)

# Elementwise square root; produces the array
# [[ 1.          1.41421356]
#  [ 1.73205081  2.        ]]
print np.sqrt(x)

x = np.array([[1,2],[3,4]])

print np.sum(x)  # Compute sum of all elements; prints "10"
print np.sum(x, axis=0)  # Compute sum of each column; prints "[4 6]"
print np.sum(x, axis=1)  # Compute sum of each row; prints "[3 7]"

#sum is used to comute the sum axiswise.

x = np.array([1,2], [3, 4])
print x
print x.T #used to get the transpose of the matrix

#y[i: ] = x[i: ] + v, adds v to each element, row, of x and fills in y.
#.tile is used to stack 4 copies of v on top of each other.
v = np.array([1, 0, 1])
vv = np.tile(v, (4,1))
print vv
#In broadcasting, multiplecopies are not needed.

from scipy.misc import imread, imsave, imresize

# Read an JPEG image into a numpy array
img = imread('assets/cat.jpg')
print img.dtype, img.shape  # Prints "uint8 (400, 248, 3)"

# We can tint the image by scaling each of the color channels
# by a different scalar constant. The image has shape (400, 248, 3);
# we multiply it by the array [1, 0.95, 0.9] of shape (3,);
# numpy broadcasting means that this leaves the red channel unchanged,
# and multiplies the green and blue channels by 0.95 and 0.9
# respectively.
img_tinted = img * [1, 0.95, 0.9]

# Resize the tinted image to be 300 by 300 pixels.
img_tinted = imresize(img_tinted, (300, 300))

# Write the tinted image back to disk
imsave('assets/cat_tinted.jpg', img_tinted)

#scipy.spatial.distance.pdist is used to calc the distance between the two points.

import matplotlib.pyplot as plt

# Compute the x and y coordinates for points on sine and cosine curves
x = np.arange(0, 3 * np.pi, 0.1)
y_sin = np.sin(x)
y_cos = np.cos(x)

# Plot the points using matplotlib
plt.plot(x, y_sin)
plt.plot(x, y_cos)
plt.xlabel('x axis label')
plt.ylabel('y axis label')
plt.title('Sine and Cosine')
plt.legend(['Sine', 'Cosine'])
plt.show()
